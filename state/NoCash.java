package state;

public class NoCash implements AtmState {

    AtmMachine atmMachine;

    public NoCash(AtmMachine newAtmMachine) {
        this.atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Atm out of money");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card entered. Atm out of money");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Atm out of money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Atm out of money");
    }
}
