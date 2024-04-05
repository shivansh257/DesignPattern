package state;

/**
 * context - maintains instance of concrete subclass that defines the state
 */
public class AtmMachine {
    AtmState hasCard;
    AtmState noCard;
    AtmState hasCorrectPin;
    AtmState atmOutOfMoney;

    AtmState atmState;
    int cashInMachine;
    boolean correctPinEntered;

    public AtmMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);

        this.cashInMachine = 2000;
        correctPinEntered = false;

        atmState = this.noCard;
        if(cashInMachine <= 0) {
            atmState =this.atmOutOfMoney;
        }
    }

    void setAtmState(AtmState newState) {
        this.atmState = newState;
    }

    public void addCashInMachine(int money) {
        this.cashInMachine += money;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCard(int cashToWithdraw) {
        atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinEntered) {
        atmState.insertPin(pinEntered);
    }

    public AtmState getHasCardState() {
        return hasCard;
    }

    public AtmState getNoCardState() {
        return noCard;
    }
    public AtmState getHasCorrectPin() {
        return hasCorrectPin;
    }
    public AtmState getNoCashState() {
        return atmOutOfMoney;
    }
}
