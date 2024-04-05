package state;

public class HasPin implements AtmState {

    AtmMachine atmMachine;

    public HasPin(AtmMachine newAtmMachine) {
        this.atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already entered");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Pin already entered");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if(cashToWithdraw <= atmMachine.cashInMachine) {
            System.out.println("withdrawing cash");
            atmMachine.addCashInMachine(-cashToWithdraw);
            System.out.println("ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
            if(atmMachine.cashInMachine <= 0) {
                System.out.println("out of cash");
                atmMachine.setAtmState(atmMachine.getNoCashState());
            }
        } else {
            System.out.println("dont have enough cash");
            System.out.println("ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }
}
