package State;
//State when player is paused
public class PausedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Resuming playback.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Already paused.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback");
        player.setState(new StoppedState());
    }
}
