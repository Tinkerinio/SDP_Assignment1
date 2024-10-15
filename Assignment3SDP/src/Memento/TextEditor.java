package Memento;

public class TextEditor {
    private StringBuilder currentText;

    public TextEditor() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }

    public String getText() {
        return currentText.toString();
    }

    public TextMemento save() {
        return new TextMemento(currentText.toString());
    }

    public void restore(TextMemento memento) {
        currentText = new StringBuilder(memento.getText());
    }
}
