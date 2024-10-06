package Assignment2.Adapter;

import Assignment2.Document;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    //Задача: Реализуйте логику для адаптера, чтобы методы PDF-документа могли быть использованы через интерфейс Document.
        @Override
    public void display() {
        // Адаптируем метод display() для PDF документа
        System.out.println("Адаптированный вывод для PDF-документа:");
        pdfDocument.openPDF();
        pdfDocument.showPDF();
    }
}

