package com.strategy.paymentService;

public class PaymentByPayPal implements PaymentStrategy {
    @Override
    public void collectPaymentDetails() {

    }

    @Override
    public boolean validatePaymentDetails() {

        return false;
    }

    @Override
    public void pay(int totalAmount) {

    }
}
