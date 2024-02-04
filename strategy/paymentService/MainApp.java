package com.strategy.paymentService;

public class MainApp {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new PaymentByCreditCard());
        paymentService.processOrder();
    }
}
