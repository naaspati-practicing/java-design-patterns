package com.iluwatar.command;

public class InvisibilitySpell extends Command {
	private Visibility oldVisibility;
	private Target target;

	@Override
	public void execute(Target target) {
		this.oldVisibility = target.getVisibility();
		target.setVisibility(Visibility.INVISIBLE);
		this.target = target;
	}

	@Override
	public void undo() {
		if(target != null){
			Visibility temp = this.target.getVisibility();
			this.target.setVisibility(oldVisibility);
			this.oldVisibility = temp;
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "Invisibility spell";
	}

}
