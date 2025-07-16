package day10;

import java.util.Stack;

interface Command {
    void execute();
    void undo();
}

class AddTextCommand implements Command {
    private TextEditor editor;
    private String text;

    public AddTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.append(text);
    }

    @Override
    public void undo() {
        editor.delete(text.length());
    }
}

class CommandInvoker {
    private Stack<Command> commandHistory = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            Command command = commandHistory.pop();
            command.undo();
        }
    }
}
