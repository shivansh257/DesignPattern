package com.strategy.paymentService;

/**
 * Each payment specific logic in separate class
 * TO make them interchangable we need to have common interface
 */
public class PaymentByCreditCard implements PaymentStrategy {
    private CreditCard card;
    @Override
    public void collectPaymentDetails() {
        // pop-up to collect card details
        card = new CreditCard(/**add info*/);
    }

    @Override
    public boolean validatePaymentDetails() {
        // validate card details
        return true;
    }

    @Override
    public void pay(int totalAmount) {
        // collect card details
        // validate
        // pay
        card.setAmount(totalAmount);
        System.out.println("paying using CC " + totalAmount);
        // call the accessor layer to deduct the money from the client.
        // razorPayAccessor.deductMoney(paymentMethodDetails, amount);
        // might have to create the input for accessor in builder layer as multiple clients can call it
    }
}
