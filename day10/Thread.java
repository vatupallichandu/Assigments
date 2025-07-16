package day10;

class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void append(String str) {
        text.append(str);
    }

    public void delete(int length) {
        text.delete(text.length() - length, text.length());
    }

    public String getText() {
        return text.toString();
    }

    public Memento save() {
        return new Memento(text.toString());
    }

    public void restore(Memento memento) {
        text = new StringBuilder(memento.getSavedState());
    }

    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }

        private String getSavedState() {
            return state;
        }
    }
}

