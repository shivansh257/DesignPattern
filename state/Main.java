package state;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();
        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertPin(1234);
        atmMachine.requestCard(2000);
        atmMachine.insertCard();
        atmMachine.insertPin(1231);
        atmMachine.insertPin(1234);

//        Random random = new Random();
//
//        System.out.println(random.nextInt());
    }
}
