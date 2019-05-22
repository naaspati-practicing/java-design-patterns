package com.iluwatar.command;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wizard {
	private static final Logger LOGGER = LoggerFactory.getLogger(Wizard.class);

	private Stack<Command> undoStack = new Stack<>();
	private Stack<Command> redoStack = new Stack<>();

	public void  castSpell(Command command,Target target) {
		LOGGER.info("{} casts {} at {}", this, command, target);
		command.execute(target);
		undoStack.push(command);
	}
	public void undoLastSpell() {
		if(!undoStack.isEmpty()) {
			Command c = undoStack.pop();
			redoStack.push(c);
			LOGGER.info("{} redoes {}", this, c);
			c.redo();
		}
	}

	public void redoLastSpell() {
		if(!redoStack.isEmpty()) {
			Command c = redoStack.pop();
			undoStack.push(c);
			LOGGER.info("{} undoes {}", this, c);
			c.undo();
		}
	}

		@Override
	public String toString() {
		return "Wizard";
	}

}
