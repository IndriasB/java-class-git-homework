package engines;

import misc.GameState;

public class WindEngine implements Engine {
    public void updateState(GameState state) {
        double oldXVelocity = state.getBall().getxVelocity();
        state.getBall().setxVelocity(oldXVelocity - .01);
    }
}
