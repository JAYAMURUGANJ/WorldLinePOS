package com.example.sample_print

import io.flutter.embedding.android.FlutterActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugin.common.MethodChannel
import org.json.JSONObject


class MainActivity: FlutterActivity() {


    private val METHOD_CHENNEL_WORLDLINE = "sdkMethodChannel"
    private var resultHandler: MethodChannel.Result? = null
    private  var printHelper:PrintHelper = PrintHelper()

    companion object {
        var flutterEngineInstance: FlutterEngine? = null
    }

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        flutterEngineInstance = flutterEngine
        MethodChannel(
            flutterEngine.dartExecutor.binaryMessenger,
            METHOD_CHENNEL_WORLDLINE
        ).setMethodCallHandler { call, result ->
            resultHandler = result
            when (call.method) {
                "printReceipt" -> {
                    result.success(printHelper.printLoop(
                        context, call.arguments as ArrayList<HashMap<Any, String>>
                    ))
                }

            }
        }
    }



}
