package com.iluwatar.command;

public interface ICommand {
	void execute(Target target);
	void undo();
	void redo();
}
