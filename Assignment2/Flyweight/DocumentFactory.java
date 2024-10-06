package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.Proxy.ProxyDocument; // Заменяем RealDocument на ProxyDocument

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Метод для получения документа по заголовку
    public static Document getDocument(String title) {
        // Проверяем, существует ли документ с данным заголовком
        if (!documentMap.containsKey(title)) {
            // Если не существует, создаем новый документ и добавляем его в карту
            Document document = new ProxyDocument(title); // Используем ProxyDocument
            documentMap.put(title, document);
            System.out.println("Создан новый документ: " + title);
            return document;
        }
        // Если документ уже существует, возвращаем его из карты
        System.out.println("Используется существующий документ: " + title);
        return documentMap.get(title);
    }
}
