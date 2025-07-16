package day10;

import java.util.Stack;

class Caretaker {
    private Stack<TextEditor.Memento> undoStack = new Stack<>();
    private Stack<TextEditor.Memento> redoStack = new Stack<>();

    public void save(TextEditor editor) {
        undoStack.push(editor.save());
        redoStack.clear(); // Clear redo stack on new action
    }

    public void undo(TextEditor editor) {
        if (!undoStack.isEmpty()) {
            redoStack.push(editor.save());
            editor.restore(undoStack.pop());
        }
    }

    public void redo(TextEditor editor) {
        if (!redoStack.isEmpty()) {
            undoStack.push(editor.save());
            editor.restore(redoStack.pop());
        }
    }
}

