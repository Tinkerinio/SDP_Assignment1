package Memento;

public class Caretaker {
    private TextMemento memento;

    public void saveState(TextEditor editor) {
        memento = editor.save();
    }

    public void restoreState(TextEditor editor) {
        if (memento != null) {
            editor.restore(memento);
        }
    }
}
