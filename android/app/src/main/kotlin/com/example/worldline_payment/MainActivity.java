package com.example.worldline_payment;

import static com.example.worldline_payment.transactions.ActionID.CONFIGURATION;
import static com.example.worldline_payment.transactions.ActionID.NETWORK;
import static com.example.worldline_payment.transactions.Config.ACTION;
import static com.example.worldline_payment.transactions.Config.CUSTOM_ACTION;
import static com.example.worldline_payment.transactions.Config.IS_PACKAGE_CHECK;
import static com.example.worldline_payment.transactions.Config.PACKAGE_NAME;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.worldline_payment.Utils.AppUtils;
import com.example.worldline_payment.transactions.ActionID;

import java.text.DecimalFormat;
import java.util.Random;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;


public class MainActivity  extends FlutterActivity {

  public  String methodChannelWorldLine ="sdkMethodChannel";
  public MethodChannel.Result resultHandler = null;
  public FlutterEngine flutterEngineInstance = null;


    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        flutterEngineInstance = flutterEngine;
       new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(),methodChannelWorldLine)
               .setMethodCallHandler((call, result) -> {
                   resultHandler = result;
                   switch (call.method){
                       case "hello":
                           result.success(hello());
                           break;
                           case "configureNetwork":
                               configureNetwork();
                           break;
                           case "initializeSdk":
                               InitializeSdk();
                           break;
                           case "cardPayment":
                               CardPayment("500");
                           break;
                           case "bharatQrPayment":
                               BharatQrPayment("10");
                           break;
                           case "upiPayment":
                               UpiPayment("20");
                           break;
                           case "getTransactionDetails":
                               GetTransactionDetails("20");
                           break;
                   }
               });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        try {
            Log.e("value message",data.getStringExtra("message"));
            Bundle bundle = data.getExtras();
            if (bundle != null) {
                Log.e("bundle value",bundle.toString());
                for (String key : bundle.keySet()) {

                    Log.e("keys" + key, key + " : " + (bundle.get(key) != null ? bundle.get(key) : "NULL"));
                }
            }
            switch (resultCode){
                case 1500:
                case 1501:
                    resultHandler.success(data.getStringExtra("message"));
                    break;
                case 1502:
                case 1503:
                case 1504:
                case 1505:
                {
                    resultHandler.success(data.getStringExtra("message"));
                    break;
                }
                default:
                    break;

            }





        }catch (Exception e){
            Log.e("value catch",e.getMessage());
            resultHandler.error("13",e.getMessage(),"sdk_error");
        }

    }


    public  String hello(){
        return"hello from Java";
    }

    public void configureNetwork() {
        if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
            String CUSTOM_ACTION = "com.example.menusample.YOUR_ACTION_CONFIG";
            Intent i = new Intent();
            i.setAction(CUSTOM_ACTION);
            i.putExtra("actionId", NETWORK);
            i.putExtra("action", ACTION);
            i.putExtra("package", PACKAGE_NAME);
            this.startActivityForResult(i, 1500);
        } else {
            Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
        }
    }

    public void InitializeSdk() {
        if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
            Intent i = new Intent();
            i.setAction(CUSTOM_ACTION);
            i.putExtra("actionId", CONFIGURATION);// mandatory
            i.putExtra("action", ACTION);
            i.putExtra("package", PACKAGE_NAME);
            this.startActivityForResult(i, 1501);
        } else {
            Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
        }
    }

    public void CardPayment(@NonNull String amount) {
        if (amount.trim().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        } else if (amount.trim().length() <= 6) {
            String saleAmount = getConvertDoubleval(amount);
            goSaleAction(saleAmount);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        }
    }

    public String getConvertDoubleval(@NonNull String amount) {
        Log.e("tag", "print amount" + amount);
        if (amount.length() == 0) {
            amount = "0";
        }
        DecimalFormat formatter = new DecimalFormat("#0.00");
        double d = Double.parseDouble(amount);
        amount = formatter.format(d);
        Log.e("tag", "print new amount" + amount);
        return amount;
    }

    private void goSaleAction(String amount) {

        if (AppUtils.haveInternetConnection(getBaseContext())) {

            if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
                String transaction_id = "1234567890";
             //   String transaction_id = getTransactionId();
                Intent i = new Intent();
                i.setAction(CUSTOM_ACTION);
                i.putExtra("package", PACKAGE_NAME);
                // [Mandatory] [Sting value] [Transaction amount]
                i.putExtra("amount", amount);
                // [Mandatory] [Always true]
                i.putExtra("result_mode", true);
                // [Mandatory] [inApp]
                i.putExtra("action", "inApp");
                // [Mandatory] [ture or false] [Receipt printing option]
                i.putExtra("receipt", "YES");
                // [Mandatory] [Int value] [Transaction type] [Refer ActionID file]
                i.putExtra("actionId", ActionID.SALE);
                // [Mandatory] [Sting value] [Transaction reference number ]
                i.putExtra("transaction_id", transaction_id);
//                i.putExtra("transaction_id", "");
                // [Optional] [Sting value] [Same value will be returned in response]
                i.putExtra("udf1", "Value1");
                i.putExtra("udf2", "Value2");
                i.putExtra("udf3", "Value3");
                i.putExtra("udf4", "Value4");
                i.putExtra("udf5", "Value5");
                i.putExtra("udf6", "Value6");
                i.putExtra("result_code", 600);
                this.startActivityForResult(i, 1502);
            } else {
                Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No internet connection available", Toast.LENGTH_SHORT).show();
        }

    }

    public String getTransactionId() {
//        int currenNo = 1;
//        int nextNo = (currenNo + 1) % 1000000;
//        return String.format("%06d", nextNo);
        Random rnd = new Random();
        int s = 100000 + rnd.nextInt(900000);
        String Id = String.valueOf(s);
        return Id;
    }


    public void BharatQrPayment(@NonNull String amount) {
        if (amount.trim().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        } else if (amount.trim().length() <= 6) {
            goBQR(amount);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        }
    }

    private void goBQR(String amount) {

        if (AppUtils.haveInternetConnection(getBaseContext())) {
            if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
                String transaction_id = getTransactionId();
                Intent i = new Intent();
                i.setAction(CUSTOM_ACTION);
                i.putExtra("package", PACKAGE_NAME);
                // [Mandatory] [Sting value] [Transaction amount]
                i.putExtra("amount", amount);
                // [Mandatory] [Always true]
                i.putExtra("result_mode", true);
                // [Mandatory] [inApp]
                i.putExtra("action", "inApp");
                // [Mandatory] [ture or false] [Receipt printing option]
                i.putExtra("receipt", "YES");
                // [Mandatory] [Int value] [Transaction type] [Refer ActionID file]
                i.putExtra("actionId", ActionID.QR_SALE_BQR);
                // [Mandatory] [Sting value] [Transaction reference number ]
                i.putExtra("transaction_id", transaction_id);
//                i.putExtra("transaction_id", "");
                // [Optional] [Sting value] [Same value will be returned in response]
                i.putExtra("udf1", "Value1");
                i.putExtra("udf2", "Value2");
                i.putExtra("udf3", "Value3");
                i.putExtra("udf4", "Value4");
                i.putExtra("udf5", "Value5");
                i.putExtra("udf6", "Value6");
                i.putExtra("result_code", 600);
                this.startActivityForResult(i, 1503);
            } else {
                Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "No internet connection available", Toast.LENGTH_SHORT).show();
        }
    }


    private void UpiPayment(String amount) {
        if (amount.trim().equalsIgnoreCase("")) {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        } else if (amount.trim().length() <= 6) {
            goUPI(amount);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid Amount", Toast.LENGTH_LONG).show();
        }
    }

    private void goUPI(String amount) {

        if (AppUtils.haveInternetConnection(getBaseContext())) {

            if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
                String transaction_id = getTransactionId();
                Intent i = new Intent();
                i.setAction(CUSTOM_ACTION);
                i.putExtra("package", PACKAGE_NAME);
                // [Mandatory] [Sting value] [Transaction amount]
                i.putExtra("amount", amount);
                // [Mandatory] [Always true]
                i.putExtra("result_mode", true);
                // [Mandatory] [inApp]
                i.putExtra("action", "inApp");
                // [Mandatory] [ture or false] [Receipt printing option]
                i.putExtra("receipt", "YES");
                // [Mandatory] [Int value] [Transaction type] [Refer ActionID file]
                i.putExtra("actionId", ActionID.QR_SALE_UPI);
                // [Mandatory] [Sting value] [Transaction reference number ]
                i.putExtra("transaction_id", transaction_id);
//                i.putExtra("transaction_id", "");
                // [Optional] [Sting value] [Same value will be returned in response]
                i.putExtra("result_code", 600);
                this.startActivityForResult(i, 1504);
            } else {
                Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "No internet connection available", Toast.LENGTH_SHORT).show();
        }
    }

    public void GetTransactionDetails(String transactionId ) {
        if (AppUtils.haveInternetConnection(getBaseContext())) {
            if (AppUtils.isPackageExisted(this, IS_PACKAGE_CHECK)) {
                Intent i = new Intent();
                i.setAction(CUSTOM_ACTION);
                i.putExtra("package", PACKAGE_NAME);
                // [Mandatory] [Always true]
                i.putExtra("result_mode", true);
                // [Mandatory] [inApp]
                i.putExtra("action", "inApp");
                i.putExtra("transaction_id", transactionId); // Reference Id
                i.putExtra("actionId", ActionID.TRANSSTATUSCHECK);
                this.startActivityForResult(i, 1505);
            } else {
                Toast.makeText(this, "Please Install WLPAY Application", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "No internet connection available",
                    Toast.LENGTH_SHORT).show();
        }
    }


}
