package com.github.sorabh86.designpattern.memento;

public interface WorkflowCommand {
	void execute();
	void undo();
}
