package memento;

public class Main {
    public static void main(String[] args) {
//        Editor editor = new Editor();
//        editor.write("hello ");
//        editor.write("world ");
//        editor.write("great");
//
//        editor.undo();

        /**
         * in other examples main is responsibel for adding in textArea then saving in editor history
         * not editor doing both the things
         * step-1 make main responsible for calling textArea
         * step-2 remove textArea completely from editor
         * step-3 call createSnapshot from main
         *
         */

        TextArea textArea = new TextArea();
        Editor editor = new Editor();
        textArea.set("Hello");
        editor.write();

        textArea.set("world");
        editor.write();

        textArea.set("great");
        editor.write();

        editor.undo();
        System.out.println(textArea.getText());



    }
}
