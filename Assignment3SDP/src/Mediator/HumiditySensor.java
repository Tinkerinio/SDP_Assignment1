package Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;

    public HumiditySensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendData() {
        String data = "45%";
        System.out.println("HumiditySensor sending data: " + data);
        mediator.collectData(this, data);
    }
}
