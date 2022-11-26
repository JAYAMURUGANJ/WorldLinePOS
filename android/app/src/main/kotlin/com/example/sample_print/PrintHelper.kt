package com.example.sample_print
import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.util.Log
import android.widget.Toast
import com.pos.device.printer.PrintCanvas
import com.pos.device.printer.PrintTask
import com.pos.device.printer.Printer
import com.pos.device.printer.PrinterCallback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.CountDownLatch
import kotlin.concurrent.thread
import kotlin.experimental.or


class PrintHelper {
    private var printer: Printer? = null
    private var printTask: PrintTask? = null
    private  var fontAlignment:FontAlignment = FontAlignment()
     fun printLoop(context: Context, receiptDatas:ArrayList<HashMap<Any, String>>){
        Log.e("reciptDataLength","${receiptDatas.count()}")
        runBlocking{
            for (receiptData in receiptDatas) {
                launch(Dispatchers.IO) {
                    delay(1000)
                    printReceipt(context, receiptData)

                }

            }
        }
    }
    fun printReceipt(context: Context,receiptData:HashMap<Any, String>): Int {

        Log.e("json oo","$receiptData")
        val payMode:String = receiptData["pay_mode"]!!
        val templeName:String = receiptData["temple_name"]!!
        val ticketName:String =  receiptData["ticket_name"]!!
        val ticketPrice:String = receiptData["ticket_price"]!!
        val receiptNo:String = receiptData["receipt_no"]!!
        val receiptDate:String = receiptData["receipt_date"]!!
        val ticketCount:String= receiptData["ticket_count"]!!
        val totalAmount:String = receiptData["total_amount"]!!
        val descLeft:String = receiptData["desc_left"]!!
        val descRight:String = receiptData["desc_right"]!!

        val canvas = PrintCanvas()
        val paint = Paint()

        //Font style , size , bold
        fontAlignment.setFontStyle(paint, 2, false)
        val image = fontAlignment.getQrCodeBitmap(receiptNo!!)
        canvas.drawBitmap(fontAlignment.pad(image,0F,0F,60F,50F), paint)
        fontAlignment.setFontStyle(paint, 3, true)
        canvas.drawText(fontAlignment.alignCenterSize2(payMode), paint)
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        canvas.drawText(fontAlignment.alignCenterSize1(templeName), paint)
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        fontAlignment.setFontStyle(paint, 4, true)
        canvas.drawText(fontAlignment.alignCenterSize2(ticketName), paint)
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        fontAlignment.setFontStyle(paint, 1, true)
        canvas.drawText(
            fontAlignment.leftRightAlignment("Receipt No", receiptNo),
            paint
        )
        fontAlignment.setFontStyle(paint, 1, true)
        canvas.drawText(
            fontAlignment.leftRightAlignment("Receipt Date", receiptDate!!),
            paint
        )
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        fontAlignment.setFontStyle(paint, 4, true)
        canvas.drawText(fontAlignment.alignCenterSize2("$ticketCount * ₹$ticketPrice = ₹$totalAmount"), paint)
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        fontAlignment.setFontStyle(paint, 1, true)
        canvas.drawText(fontAlignment.leftRightAlignment(descLeft!!, descRight!!), paint)
        fontAlignment.setFontStyle(paint, 3, false)
        fontAlignment.printLine(paint, canvas)
        fontAlignment.setFontStyle(paint, 1, true)
        canvas.drawText(fontAlignment.leftRightAlignment("Help Line No", "044-28339999"), paint)
        canvas.drawText("                                  ", paint)
        canvas.drawText("                                  ", paint)
        return printData(canvas, context)
    }
    private fun printData(pCanvas: PrintCanvas, context:Context): Int {
        printer = Printer.getInstance()
        printTask = PrintTask()
        printTask!!.gray = 130
        Log.e("printData","entered")
        val latch = CountDownLatch(1)
        val ret: Int = printer!!.status
        runBlocking {
            launch(Dispatchers.IO) {

                if (ret == Printer.PRINTER_OK) {
                    Log.e("printData", "printer ok")
                    val result: ByteArray = draw2PxPoint(pCanvas.bitmap)!!
                    printTask!!.setPrintBuffer(result)
                    printer!!.startPrint(printTask, PrinterCallback { i, printTask ->
                        Log.v("ResultControl", "onResult 3 : $i")
                    })
                } else {
                    Toast.makeText(context, "Please insert paper roll", Toast.LENGTH_LONG).show()
                }
                delay(2000)
            }

        }
        return ret
    }
    private fun draw2PxPoint(bitmap: Bitmap): ByteArray? {
        val height = bitmap.height
        val width = bitmap.width
        val square = height * width
        val pixels = IntArray(square)
        bitmap.getPixels(pixels, 0, width, 0, 0, width, height)
        val data = ByteArray(square shr 3)
        var B = 0
        var b = 0
        val bits = byteArrayOf(0x80.toByte(), 0x40, 0x20, 0x10, 0x08, 0x04, 0x02, 0x01)
        for (i in 0 until square) {
            if (pixels[i] < -7829368) { //- 0x888888
                data[B] = data[B] or bits[b]
            }
            if (b == 7) {
                b = 0
                B++
            } else {
                b++
            }
        }
        return data
    }




}