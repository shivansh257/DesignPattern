package com.strategy.paymentService;

public interface PaymentStrategy {
    void collectPaymentDetails();
    boolean validatePaymentDetails();
    void pay(int totalAmount);
}
