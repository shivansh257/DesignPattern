package memento;

import lombok.Getter;

/**
 * originator or state class/ manages the state of the class
 */
@Getter
public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    /**
     * does not expose how to save the data
     * @return
     */
    public Memento snapshot() {             // restoreMemento
        return new Memento(this.text);
    }

    public void restore(Memento memento) {  // createMemento
        this.text = memento.getSavedText();
    }

    /**
     * Memento
     */
    public static class Memento {
        private final String text;

        private Memento(String textToSave) {
            this.text = textToSave;
        }

        private String getSavedText() {
            return this.text;
        }
    }
}
