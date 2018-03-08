package engines;

import models.GameModel;

/**
 * Engine which applies the force of gravity to items within the game.
 */
public class WindEngine {
    public void updateState(GameModel state) {
		       double oldXVelocity = state.getBall().getxVelocity();
        state.getBall().setxVelocity(oldXVelocity  -0.2);
	}
}
