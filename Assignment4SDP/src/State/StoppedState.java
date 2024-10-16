package State;
//State when player is stopped
public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Starting playback.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Cannot pause, player is stopped");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Already stopped");
        player.setState(new StoppedState());
    }
}
