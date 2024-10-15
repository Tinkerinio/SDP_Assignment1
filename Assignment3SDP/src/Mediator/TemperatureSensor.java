package Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "22°C";
        System.out.println("TemperatureSensor sending data: " + data);
        mediator.collectData(this, data);
    }
}
