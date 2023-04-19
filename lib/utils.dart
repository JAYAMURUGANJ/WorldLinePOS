import 'package:flutter/services.dart';

class AppUtils {
  String response = "";
  MethodChannel platform = const MethodChannel('sdkMethodChannel');

  Future<String> check() async {
    try {
      final String result = await platform.invokeMethod('hello');
      print(result);
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> configureNetwork() async {
    try {
      final String result = await platform.invokeMethod('configureNetwork');
      print("network result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> initializeSdk() async {
    try {
      final String result = await platform.invokeMethod('initializeSdk');
      print("initialize sdk result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> cardPayment() async {
    try {
      final String result = await platform.invokeMethod('cardPayment');
      print("payment result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> bharatQrPayment() async {
    try {
      final String result = await platform.invokeMethod('bharatQrPayment');
      print("bharat result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> upiPayment() async {
    try {
      final String result = await platform.invokeMethod('upiPayment');
      print("upi result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }

  Future<String> getTransactionDetails() async {
    try {
      final String result =
          await platform.invokeMethod('getTransactionDetails');
      print("transaction result $result");
      return response = result;
    } on PlatformException catch (e) {
      return response = e.message!;
    }
  }
}
