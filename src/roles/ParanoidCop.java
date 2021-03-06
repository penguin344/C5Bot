package roles;

import game.Game;

public class ParanoidCop extends Cop {

	public ParanoidCop() {

	}

	@Override
	public void doAction(Game g) {
		if(g.getState().equals(Game.State.NIGHT)&&actor.isAlive()){
			if(actor.isHooked()){
				actor.appendResult("Your action failed as you were hooked.");
			}else target.ifPresent(t ->{
				actor.appendResult(t.getIdentifier()+wolfResult);
			});
		}
	}

	@Override
	public String getTrueName() {
		return "Paranoid Cop";
	}	
}
