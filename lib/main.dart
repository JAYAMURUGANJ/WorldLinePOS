// ignore_for_file: avoid_print

import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:qr_flutter/qr_flutter.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  static const platform = MethodChannel('sdkMethodChannel');
  GlobalKey globalKey1 = GlobalKey();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(widget.title),
      ),
      body: const Center(
        child: Text(
          'Click the button to print the bill',
        ),
      ),
      floatingActionButtonLocation: FloatingActionButtonLocation.startFloat,
      floatingActionButton: FloatingActionButton(
        onPressed: () {
          samplePrint(platform, globalKey1)
              .then((value) => print("printer-status: $value"));
        },
        tooltip: 'Increment',
        child: const Icon(Icons.print),
      ),
    );
  }

  Future samplePrint(MethodChannel platform, GlobalKey globalKey) async {
    try {
      var receiptData = [
        {
          "pay_mode": " POS ePay [CARD] ",
          "temple_name":
              "Arulmigu Vadapalani Andavar Temple, Vadapalani, Chennai - 600026",
          "ticket_name": "Archanai",
          "ticket_price": "25.00",
          "receipt_no": "S0000622092300003259",
          "receipt_date": "23/10/2022 05:26 PM",
          "ticket_count": "20",
          "total_amount": "500.00",
          "desc_left": 'DC CUM EO',
          "desc_right": 'H. Trustee'
        },
        {
          "pay_mode": " POS ePay [CASH] ",
          "temple_name":
              "Arulmigu Vadapalani Andavar Temple, Vadapalani, Chennai - 600026",
          "ticket_name": "Vibuthi",
          "ticket_price": "50.00",
          "receipt_no": "S0000622092300003260",
          "receipt_date": "23/10/2022 05:50 PM",
          "ticket_count": "20",
          "total_amount": "1000.00",
          "desc_left": 'DC CUM EO',
          "desc_right": 'H. Trustee'
        }
      ];

      final int result =
          await platform.invokeMethod('printReceipt', receiptData);
      print("haiaddd $result");
    } on PlatformException catch (e) {
      print("dhdfgdhgh ${e.message}");
    }
  }

  showPrintResponse() {}
  showSnackbar() {}
  showAlertDialog() {}
}
