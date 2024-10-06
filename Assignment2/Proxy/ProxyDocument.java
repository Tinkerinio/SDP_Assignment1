package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // Реализация ленивой загрузки документа
    @Override
    public void display() {
        // Если документ ещё не загружен, загружаем его
        if (realDocument == null) {
            realDocument = new RealDocument(title);
        }

        // Отображаем загруженный документ
        realDocument.display();
    }
}
