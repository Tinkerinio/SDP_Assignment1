package Command;

public class Television {
    private int volume = 10;
    private int channel = 1;

    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Volume is at " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Volume is at " + volume);
    }

    public void nextChannel() {
        channel++;
        System.out.println("Channel is " + channel);
    }

    public void previousChannel() {
        channel--;
        System.out.println("Channel is " + channel);
    }
}
