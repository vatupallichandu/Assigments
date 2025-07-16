package day10;
public class MainClass {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();
        CommandInvoker invoker = new CommandInvoker();

        // Create and execute commands
        Command addHello = new AddTextCommand(editor, "Hello ");
        Command addWorld = new AddTextCommand(editor, "World!");
        invoker.executeCommand(addHello);
        invoker.executeCommand(addWorld);

        // Save state
        caretaker.save(editor);

        System.out.println("Current Text: " + editor.getText()); // Output: Hello World!

        // Undo last command
        invoker.undo();
        System.out.println("After Undo: " + editor.getText()); // Output: Hello

        // Redo last command
        caretaker.redo(editor);
        System.out.println("After Redo: " + editor.getText()); // Output: Hello World!
    }
}
