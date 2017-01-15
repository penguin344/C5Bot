package roles;

import game.Game;

public class NaiveCop extends Role {

	@Override
	public void doAction(Game g) {
		if(g.getState().equals(Game.State.NIGHT)&&actor.isAlive()&&!actor.isHooked()){
			actor.privateMessage(target.getName()+copResult);
		}
	}

}
