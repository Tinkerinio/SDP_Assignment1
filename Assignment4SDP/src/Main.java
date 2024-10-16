import Observer.*;
import State.*;
import Strategy.*;
import Template.*;
import Visitor.*;

public class Main {
    public static void main(String[] args) {

        //Observer Pattern usage
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        newsPublisher.publishNews("Sports", "New sports event happening!");
        newsPublisher.publishNews("Science", "New scientific discovery!");
        newsPublisher.publishNews("Politics", "Election results announced.");


        //State Pattern usage
        Player player = new Player();

        player.play();  // Start playback
        player.pause(); // Pause playback
        player.play();  // Resume playback
        player.stop();  // Stop playback
        player.pause(); // Attempt to pause while stopped
        player.play();  // Start playback again
        player.stop();  // Stop playback


        //Strategy usage
        Order order = new Order(1000); // Example order amount

        PaymentStrategy cardPayment = new CardPaymentStrategy();
        PaymentStrategy walletPayment = new WalletPaymentStrategy();
        PaymentStrategy cashOnDelivery = new CashOnDeliveryStrategy();

        // Using Card Payment Strategy
        order.setPaymentStrategy(cardPayment);
        System.out.println("Final amount with card payment: " + order.calculateFinalAmount());

        // Using Wallet Payment Strategy
        order.setPaymentStrategy(walletPayment);
        System.out.println("Final amount with wallet payment: " + order.calculateFinalAmount());

        // Using Cash On Delivery Strategy
        order.setPaymentStrategy(cashOnDelivery);
        System.out.println("Final amount with cash on delivery: " + order.calculateFinalAmount());


        //Template Method Pattern usage
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();

        System.out.println("Food Quality Check:");
        foodCheck.performCheck();

        System.out.println("\nElectronics Quality Check:");
        electronicsCheck.performCheck();


        //Visitor Pattern usage
        File textFile = new TextFile("document.txt");
        File executableFile = new ExecutableFile("program.exe");

        Visitor antivirusVisitor = new AntivirusVisitor();
        Visitor reportVisitor = new ReportVisitor();

        File[] files = {textFile, executableFile};

        System.out.println("Antivirus Scan:");
        for (File file : files) {
            file.accept(antivirusVisitor);
        }

        System.out.println("\nReport Generation:");
        for (File file : files) {
            file.accept(reportVisitor);
        }
    }
}