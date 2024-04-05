package state;

/**
 * store the context
 */
public class HasCard implements AtmState{
    private final int CORRECT_PIN = 1234;
    AtmMachine atmMachine;

    public HasCard(AtmMachine newAtmMachine) {
        this.atmMachine = newAtmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("you cannot enter more than one card");
        // state change not required
    }

    @Override
    public void ejectCard() {
        System.out.println("card ejected successfully");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("checking validity of pin");
        if(pinEntered == CORRECT_PIN) {
            System.out.println("correct pin entered");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("Wrong pin entered");
            atmMachine.correctPinEntered = false;
            System.out.println("ejecting card");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter Pin");
    }
}
