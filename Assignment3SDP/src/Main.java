import Chain.*;
import Command.*;
import Iterator.*;
import Mediator.*;
import Memento.*;

public class Main {
    public static void main(String[] args) {
        //Chain of Responsibility
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        // Setting up the chain
        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        // Attempt to purchase an item worth $210
        int purchaseAmount = 210;
        System.out.println("Attempting to pay $" + purchaseAmount);
        paymentA.handlePayment(purchaseAmount);

        //Command
        Television tv = new Television();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command volumeUp = new VolumeUpCommand(tv);
        Command volumeDown = new VolumeDownCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command previousChannel = new PreviousChannelCommand(tv);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);
        remote.setCommand(4, nextChannel);
        remote.setCommand(5, previousChannel);

        // Simulate button presses
        remote.pressButton(0); // Turn on
        remote.pressButton(2); // Volume up
        remote.pressButton(4); // Next channel
        remote.pressButton(3); // Volume down
        remote.pressButton(5); // Previous channel
        remote.pressButton(1); // Turn off


        //Iterator
        // List-based movie collection
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Movie 1");
        listCollection.addMovie("Movie 2");
        listCollection.addMovie("Movie 3");

        // Array-based movie collection
        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(3);
        arrayCollection.addMovie("Movie A");
        arrayCollection.addMovie("Movie B");
        arrayCollection.addMovie("Movie C");

        // Iterate over list-based collection
        System.out.println("Movies in List:");
        Iterator<String> listIterator = listCollection.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Iterate over array-based collection
        System.out.println("\nMovies in Array:");
        Iterator<String> arrayIterator = arrayCollection.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());

            //Mediator
            HomeMediator mediator = new HomeMediatorImpl();

            Sensor temperatureSensor = new TemperatureSensor(mediator);
            Sensor humiditySensor = new HumiditySensor(mediator);
            Sensor lightSensor = new LightSensor(mediator);

            // Sensors send data
            temperatureSensor.sendData();
            humiditySensor.sendData();
            lightSensor.sendData();

            // Print report from mediator
            ((HomeMediatorImpl) mediator).printReport();

            //Memento
            TextEditor editor = new TextEditor();
            Caretaker caretaker = new Caretaker();

            // Add text and save state
            editor.addText("Hello, ");
            caretaker.saveState(editor);
            System.out.println("Current text: " + editor.getText());

            // Add more text
            editor.addText("world!");
            System.out.println("Current text after addition: " + editor.getText());

            // Restore to previous state
            caretaker.restoreState(editor);
            System.out.println("Restored text: " + editor.getText());
        }
    }
}
