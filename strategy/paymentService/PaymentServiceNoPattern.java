package com.strategy.paymentService;

/**
 * Closed extension open modification -> every change require modification
 * Mulitple responsibility -> payment by cc, pp
 */
public class PaymentServiceNoPattern {
    private int totalCost;

    // type-1
    void processOrder() {
        CreditCard cc = new CreditCard(/**add info*/);
        // validate card details
        cc.getAmount(totalCost);
        System.out.println("paying using CC " + totalCost);
    }

    // type-2 new payment method introduced
    void processOrder(PaymentMethod paymentMethod) {
        if(PaymentMehod.getPaymentMethod().equals("CreditCard")) {
            // perform same items here
            CreditCard cc = new CreditCard(/**add indo*/);
            // validate card details
            cc.getAmount(totalCost);
        } else if(PaymentMehod.getPaymentMethod().equals("Paypal")) {
            // do something here
            String email = "";
            String password = "";
            System.out.println("paying using PP " + totalCost);
        }
    }
}
