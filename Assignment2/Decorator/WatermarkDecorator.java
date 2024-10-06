package Assignment2.Decorator;

import Assignment2.Proxy.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {

    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // Реализация метода отображения документа с водяным знаком
    @Override
    public void display() {
        // Сначала отображаем исходный документ
        decoratedDocument.display();

        // Затем добавляем водяной знак
        addWatermark();
    }

    // Метод для добавления водяного знака
    private void addWatermark() {
        System.out.println("Добавлен водяной знак к документу.");
    }
}
