package com.example.worldline_payment.Utils;

import static android.content.Context.WIFI_SERVICE;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.CountDownTimer;
import android.os.Handler;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class AppUtils {
    private static final String TAG = AppUtils.class.getSimpleName();
    static CountDownTimer countDownTimer;
    static int count = 0;
    static StringBuilder sn = new StringBuilder();
    private static boolean boot_flag = false;
    static boolean isCounterRunning = true;
    static Handler handler = new Handler();
    static int status = 0;
    public static ProgressDialog progressdialog;
    static Uri uri;
    TelephonyManager telMgr;

    public void showKeyboard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }

    public static String removeLastChar(String s) {

        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public static void closeKeyboard(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }

    public static void appendText(TextInputEditText textInputEditText, int num) {

        if (textInputEditText.getText().toString() == null) {
            textInputEditText.setText(num + "");
        } else {
            textInputEditText.setText(textInputEditText.getText().toString().trim() + num + "");
        }
    }

    public static void appendDotText(TextInputEditText textInputEditText, String dot) {

        if (textInputEditText.getText().toString() == null) {
            textInputEditText.setText(dot);
        } else {
            textInputEditText.setText(textInputEditText.getText().toString() + dot);
        }
    }

    public static boolean isSimAvailable(Context mContext) {
        boolean isAvailable = false;
        TelephonyManager telMgr = (TelephonyManager) mContext.getSystemService(Context.TELEPHONY_SERVICE);
        int simState = telMgr.getSimState();

        // AidlLogger.LOGE("tag", "sim state" + simState);
        switch (simState) {
            case TelephonyManager.SIM_STATE_ABSENT: //SimState = “No Sim Found!”;
                isAvailable=false;
                break;
            case TelephonyManager.SIM_STATE_NETWORK_LOCKED: //SimState = “Network Locked!”;
                isAvailable=false;
                break;
            case TelephonyManager.SIM_STATE_PIN_REQUIRED: //SimState = “PIN Required to access SIM!”;
                isAvailable=false;
                break;
            case TelephonyManager.SIM_STATE_PUK_REQUIRED: //SimState = “PUK Required to access SIM!”; // Personal Unblocking Code
                isAvailable=false;
                break;
            case TelephonyManager.SIM_STATE_READY:
                isAvailable=true;
                break;
            case TelephonyManager.SIM_STATE_UNKNOWN: //SimState = “Unknown SIM State!”;
                isAvailable=false;
                break;
        }
        return isAvailable;
    }

    public static void configAmount(TextView textView, Button key) {
        List<String> add_str = new ArrayList<String>();
        String no = key.getText().toString();
        String dot = ".";

        if (sn.toString().toLowerCase().indexOf(dot.toLowerCase()) != -1) {
            if (add_str.size() <= 7) {
                if (count <= 1) {
                    add_str.add(no);
                    sn.append(no);
                    textView.setText(sn);
                    count++;
                }
            }
        } else {
            if (add_str.size() <= 7) {
                add_str.add(no);
                sn.append(no);
                textView.setText(sn);
                count = 0;
            }
        }
    }



    public static void hideKeyboard(Activity activity) {
        InputMethodManager inputManager = (InputMethodManager) activity
                .getSystemService(Context.INPUT_METHOD_SERVICE);
        // check if no view has focus:
        View currentFocusedView = activity.getCurrentFocus();
        if (currentFocusedView != null) {
            inputManager.hideSoftInputFromWindow(currentFocusedView.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean getConn(){

        return false;
    }

    public static HostnameVerifier getHostVerify(){
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }

    public static boolean isNetworkConnected(final Context context){

        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if (networkInfo.getTypeName().equalsIgnoreCase("WIFI")){

            if (internetIsConnected()){
                return true;
            }else{
                return false;
            }
        }else if (networkInfo.getTypeName().equalsIgnoreCase("MOBILE")){

            if (internetIsConnected()){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    public static boolean internetIsConnected() {
        try {
            String command = "ping -c 1 google.com";
            return (Runtime.getRuntime().exec(command).waitFor() == 0);
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean haveInternetConnection(final Context context) {

        ConnectivityManager conMgr = (ConnectivityManager) context.getApplicationContext()
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = conMgr.getActiveNetworkInfo();

        boolean status = false;
        if (activeNetwork != null) { // connected to the internet
            if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                status = true;

            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {

                status = true;

            }
        } else {
            status = false;

        }
        return status;
    }

    public static void createProgressDialog(Context context) {
        progressdialog = new ProgressDialog(context);
        progressdialog.setIndeterminate(false);
        progressdialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressdialog.setCancelable(false);
        progressdialog.setMax(100);
        progressdialog.show();
    }




    public static String getWifiName(Context context) {
        WifiManager manager = (WifiManager) context.getSystemService(WIFI_SERVICE);
        if (manager.isWifiEnabled()) {
            WifiInfo wifiInfo = manager.getConnectionInfo();
            if (wifiInfo != null) {
                NetworkInfo.DetailedState state = WifiInfo.getDetailedStateOf(wifiInfo.getSupplicantState());
                if (state == NetworkInfo.DetailedState.CONNECTED || state == NetworkInfo.DetailedState.OBTAINING_IPADDR) {
                    return wifiInfo.getSSID();
                }
            }
        }
        return null;
    }


    public static boolean isPackageExisted(Context context,String targetPackage){
        List<ApplicationInfo> packages;
        PackageManager pm;

        pm = context.getPackageManager();
        packages = pm.getInstalledApplications(0);
        for (ApplicationInfo packageInfo : packages) {
            if(packageInfo.packageName.equals(targetPackage))
                return true;
        }
        return false;
    }


}
