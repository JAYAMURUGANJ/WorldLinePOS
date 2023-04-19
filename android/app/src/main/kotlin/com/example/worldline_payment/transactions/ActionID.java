package com.example.worldline_payment.transactions;

abstract public class ActionID {

    /**
     * To select or change network mode
     */
    public static final int NETWORK = 1001;
    /**
     * To activate tid
     */
    public static final int ACTIVATION = 1002;
    /**
     * To get MID TID configuration
     */
    public static final int CONFIGURATION = 1003;
    /**
     * To get proxy details
     */
    public static final int PROXY_DETAILS = 1004;

    /**
     * To config the SDK init in WLPAY Application
     */
    public static final int SDKINIT = 1005;

    /**
     * To get transaction details by transactionID
     */
    public static final int TRANSSTATUSCHECK = 1006;

    public static final int SALE = 1;
    public static final int VOID = 2;
    public static final int REFUND = 3;
    public static final int SETTLEMENT = 4;
    public static final int EMI_SALE = 5;
    public static final int CASHONLY = 6;
    public static final int CASHBACK	= 7;
    public static final int CREDIT_SALE = 8;
    public static final int DEBIT_SALE =	9;
    public static final int PRE_AUTH = 10;
    public static final int SALECLOSE	= 11;
    public static final int LOYAITY = 12;
    public static final int DCC_TXN = 13;
    public static final int LAST_TXN = 14;
    public static final int BATCH_REPORT = 15;
    public static final int APP_DWND = 16;
    public static final int PARAM_DWND	= 17;
    public static final int MNU_APN_SELECT	= 18;
    public static final int MNU_USER_NAME	= 19;
    public static final int MNU_USER_PWD = 20;
    public static final int CLEAR_BATCH  = 21;
    public static final int CLEAR_REVERSAL	= 22;
    public static final int KEY_EXCHANGE = 23;
    public static final int ABOUT = 24;
    public static final int APPL_INFO = 24;
    public static final int HSM_FULL_KEYEXCHANGE = 25;
    public static final int HSM_SESSION_KEYEXCHANGE = 26;
    public static final int CLEAR_SETTLEMENT = 27;
    public static final int BATCH_UPLOAD = 28;
    public static final int EMI_FETCH = 29;
    public static final int PETRO_LOGIN = 30;
    public static final int PETRO_LOGOUT = 31;
    public static final int QR_STATUS_CHECK = 32;
    public static final int LAST_SETTLEMENT = 33;
    public static final int TERMINAL_ACTIVATE = 34;
    public static final int TXN_FETCH = 35;
    public static final int TIP_ADJUST = 36;
    public static final int REVERSAL = 37;
    public static final int DETAIL_REPORT = 38;
    public static final int SUMMARY_REPORT = 39;
    public static final int STATIC = 40;
    public static final int BALANCE_INQ = 41;
    public static final int CALLMEBACK = 42;
    public static final int MVISA = 43;
    public static final int CASH_ADVANCE = 47;
    public static final int OFFLINE_SALE = 48;
    public static final int MAIL_PHONE_SALE = 49;
    public static final int REPRINT = 50;
    public static final int INITIALIZE = 51;
    public static final int OTHER_FUNCTIONS = 52;
    public static final int LAST_TRAN_FETCH = 53;
    public static final int LAST_SUMMARY_REPORT = 54;
    public static final int MNU_WALLET = 55;
    public static final int MNU_CONFIGURE_PARAM = 56;
    public static final int WALLET_SALE = 57;
    public static final int WALLET_REFUND = 58;
    public static final int MNU_NII = 59;
    public static final int MNU_TERMINAL_ID = 60;
    public static final int MNU_COMM_CHANNEL = 61;
    public static final int MNU_HOST_IP = 62;
    public static final int MNU_HOST_PORT = 63;
    public static final int MNU_MEDIA = 64;
    public static final int COMMON_QR_CODE = 65;
    public static final int WALLET_VOID = 66;
    public static final int UPI_TXN = 67;
    public static final int BIOMETRIC = 68;
    public static final int RETAIL = 69;
    public static final int LAST_DETAIL_REPORT = 70;
    public static final int SET_TMK = 71;
    public static final int CLEAR_PREAUTH = 72;
    public static final int ADJUST_TXN = 73;
    public static final int OFFLINE_DOWNLOAD = 74;
    public static final int LAST4DIGIT = 75;
    public static final int FORCESETTLE = 76;
    public static final int MERCHANT_INFO = 77;
    public static final int OS_INFO = 78;
    public static final int CONVERT_INR = 79;
    public static final int PREAUTH_REPORT	= 80;
    public static final int FETCH_EXCHANGE	 = 81;
    public static final int SODEXO_SALE = 82;
    public static final int SODEXO_BALANCE = 83;
    public static final int FREECHARGE	= 84;
    public static final int TEST_TXN = 87;
    public static final int PREAUTH_CLEAR_REPORT = 88;
    public static final int RETAIL_FETCH = 89;
    public static final int DCC_SALE_FETCH = 90;
    public static final int MNU_SIM_TYPE = 91;
    public static final int MNU_PARAMETER = 92;
    public static final int LOGO_DOWNLOAD = 93;
    public static final int SALVE_TMK_EXCHANGE_KEY = 94;
    public static final int MASTER_TMK_EXCHANGE_KEY = 95;
    public static final int LOAD_TMK_KEY = 96;
    public static final int LOAD_ZONAL_KEY = 97;
    public static final int REMOTE_DIAGNOSIS = 98;
    public static final int HELP = 99;
    public static final int CMB_CLEARREVERSAL = 101;
    public static final int CMB_CLEARBATCH = 102;
    public static final int CMB_NACNO = 103;
    public static final int CMB_PPPTIMEOUT = 104;
    public static final int CMB_DBREVERSAL = 105;
    public static final int CMB_REBOOT = 106;
    public static final int CMB_MODEM = 107;
    public static final int CMB_EDITED = 108;
    public static final int CMB = 119;
    public static final int CMB_PAPERROLL = 120;
    public static final int CMB_PAYMENT_ISSUE = 121;
    public static final int CMB_PRINTER = 122;
    public static final int CMB_KEYBOARD = 123;
    public static final int CMB_CARDREADER = 124;
    public static final int CMB_DISPLAY = 125;
    public static final int CMB_CREDIT_CARD = 126;
    public static final int CMB_HOME_LOANS = 127;
    public static final int CMB_PERSONAL_LOANS = 128;
    public static final int CMB_VECHILE_LOANS = 129;
    public static final int CMB_OTHER_LOANS = 130;
    public static final int QR_SALE = 131;
    public static final int QR_SALE_BQR = 132;
    public static final int QR_SALE_UPI = 133;
    public static final int QR_SALE_FETCH = 134;
    public static final int MONEY_LOAD	= 137;
    public static final int QR_MULTITXN_FETCH = 138;
    public static final int BQR_REFUND = 139;
    public static final int UPI_REFUND = 140;
    public static final int FCH_REFUND = 141;
    public static final int BRAND_EMI = 142;
    public static final int DYNAMIC_PROMO = 143;
    public static final int ISSUERWISE_REPORT = 144;
    public static final int MONEY_LOAD_CARD = 145;
    public static final int MONEY_LOAD_CASH = 146;
    public static final int MONEY_BALANCE_UPDATE = 147;
    public static final int AMAZON_PAY = 148;
    public static final int SMS_PAY = 150;
    public static final int DREAM_FOLKS = 151;
    public static final int SMS_PAY_STATUS_CHECK = 152;
    public static final int CLOSE_LOOP = 153;
    public static final int DEBIT_EMI = 160;
    public static final int DEBIT_EMI_SALE = 161;
    public static final int EDGE_REWARDS = 163;
    public static final int EMI_MENU = 165;
    public static final int EMI_ADD_FETCH = 166;
    public static final int CASH_WITHDRAW = 168;
    public static final int MICRO_BALANCE_INQ = 169;
    public static final int KHAATA = 801;
    public static final int SMC = 700;
    public static final int CARDLESS_EMI = 701;
    public static final int PAYLATER = 702;
    public static final int BNPL_REFUND = 703;
    public static final int VOICE = 704;
    public static final int BNPL_STATUS_CHECK = 10000;
    public static final int BQR_UPI = 10001;
}