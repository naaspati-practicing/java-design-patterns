package com.iluwatar.command;

public class ShrinkSpell extends Command {
	private Size oldSize;
	private Target target;

	@Override
	public void execute(Target target) {
		this.oldSize = target.getSize();
		target.setSize(Size.SMALL);
		this.target = target;
	}

	@Override
	public void undo() {
		if(target != null){
			Size temp = this.target.getSize();
			this.target.setSize(oldSize);
			this.oldSize = temp;
		}
	}

	@Override
	public void redo() {
		undo();
	}

	@Override
	public String toString() {
		return "Shrink spell";
	}

}
