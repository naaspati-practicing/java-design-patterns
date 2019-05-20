package com.iluwatar.facade;

import java.util.function.Consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DwarvenMineWorker {
	private static final Logger logger = LoggerFactory.getLogger(DwarvenMineWorker.class);

	public void goToSleep() {
		logger.info("{} goes to sleep.", name());
	}

	public void wakeUp() {
		logger.info("{} wakes up.", name());
	}

	public void goHome() {
		logger.info("{} goes home.", name());
	}

	public void goToMine() {
		logger.info("{} goes to the mine.", name());
	}

	protected abstract String name();
	public abstract void work();
	
	public void doThese(Action...actions) {
		for (Action e : actions)
			e.action.accept(this);
	}
	
	public static enum Action {
		GO_TO_SLEEP(DwarvenMineWorker::goToSleep), 
		WAKE_UP(DwarvenMineWorker::wakeUp), 
		GO_HOME(DwarvenMineWorker::goHome), 
		GO_TO_MINE(DwarvenMineWorker::goToMine), 
		WORK(DwarvenMineWorker::work);
		
		private final Consumer<DwarvenMineWorker> action;

		private Action(Consumer<DwarvenMineWorker> action) {
			this.action = action;
		}
	}
}
