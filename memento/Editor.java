package memento;

import java.util.Deque;
import java.util.LinkedList;

/**
 * caretaker
 * createMemento - Originator wants to save the state of this object but they dont want to understand this object
 * restoreMemento - knows what states to read to go back to the previous state
 */
public class Editor {

    private final Deque<TextArea.Memento> stateHistory;
    private final TextArea textArea;

    public Editor() {
        stateHistory = new LinkedList<>();
        textArea = new TextArea();
    }

    public void write(String text) {    // create memento
        textArea.set(text);
        stateHistory.add(textArea.snapshot());
        System.out.println(textArea.getText());
    }

    public void write() {    // create memento
        stateHistory.add(textArea.snapshot());
    }

    public void undo() {                // restore
        // undo returned
        textArea.restore(stateHistory.removeLast());
//        System.out.println(textArea.getText());
    }
}
