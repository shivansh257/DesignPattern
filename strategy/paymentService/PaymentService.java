package com.strategy.paymentService;

public class PaymentService {
    int totalAmount;
    PaymentStrategy paymentStrategy;

    PaymentService() {
    }

    PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * add details about how it needs to be processed
     * eg- in parking lot we need ticket as an input. we can pass ticket to calculate funcn
     * calculate function will call some methods to fetch the amount based on the type of vehicle, total time, gst
     */
    void processOrder() {
        paymentStrategy.collectPaymentDetails();
        if(paymentStrategy.validatePaymentDetails()) {
            paymentStrategy.pay(totalAmount);
        }
    }

    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    private void calculateTotalAmount() {   // int-returns total amount
        // totalAmount = might call some functions to calculate total amount.
        // return totalAmount
    }
}
