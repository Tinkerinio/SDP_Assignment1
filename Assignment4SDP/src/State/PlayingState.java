package State;
//State when player is playing
public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Already playing.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Pausing playback");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Stopping playback");
        player.setState(new StoppedState());
    }
}
