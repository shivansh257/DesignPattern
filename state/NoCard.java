package state;

public class NoCard implements AtmState {

    AtmMachine atmMachine;

    public NoCard(AtmMachine newAtmMachine) {
        this.atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter the pin");
        atmMachine.setAtmState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("no card entered");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Enter card");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter card");
    }
}
