package Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "300 lx";
        System.out.println("LightSensor sending data: " + data);
        mediator.collectData(this, data);
    }
}
