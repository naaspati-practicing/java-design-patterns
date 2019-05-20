package com.iluwatar.facade;

import static com.iluwatar.facade.DwarvenMineWorker.Action.*;

import com.iluwatar.facade.DwarvenMineWorker.Action;

public class DwarvenGoldmineFacade {
	private final DwarvenMineWorker[] workers;
	
	public DwarvenGoldmineFacade(DwarvenMineWorker...workers) {
		this.workers = workers;
	}
	public void startNewDay() {
		apply(WAKE_UP, GO_TO_MINE); 
	}
	
	public void digOutGold() {
		apply(WORK);
	}
	
	public void endDay( ) {
		apply(GO_HOME, GO_TO_SLEEP);
	}
	
	private void apply(Action...actions) {
		for (DwarvenMineWorker d : workers)
			d.doThese(actions);
	}
}
