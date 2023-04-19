import 'package:flutter/material.dart';
import 'package:worldline_payment/utils.dart';

class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  AppUtils appUtils = AppUtils();
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('WorldLine Payments'),
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          children: [
            ElevatedButton(
                onPressed: () {
                  appUtils.check();
                },
                child: const Text('Channel Test')),
            ElevatedButton(
                onPressed: () {
                  appUtils.configureNetwork();
                },
                child: const Text('Configure Network')),
            ElevatedButton(
                onPressed: () {
                  appUtils.initializeSdk();
                },
                child: const Text('Initialaize SDK')),
            ElevatedButton(
                onPressed: () {
                  appUtils.cardPayment();
                },
                child: const Text('Card Payment')),
            ElevatedButton(
                onPressed: () {
                  appUtils.bharatQrPayment();
                },
                child: const Text('Bharat Qr Payment')),
            ElevatedButton(
                onPressed: () {
                  appUtils.upiPayment();
                },
                child: const Text('UPI Payment')),
            ElevatedButton(
                onPressed: () {
                  appUtils.getTransactionDetails();
                },
                child: const Text('Check Pending')),
          ],
        ),
      ),
    );
  }
}
