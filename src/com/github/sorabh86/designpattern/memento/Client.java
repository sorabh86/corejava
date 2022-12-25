package com.github.sorabh86.designpattern.memento;

import java.util.LinkedList;

public class Client {
	public static void main(String[] args) {
		WorkflowDesigner designer = new WorkflowDesigner();
		LinkedList<WorkflowCommand> commands = runCommands(designer);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
	}

	private static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer) {
		LinkedList<WorkflowCommand> commands = new LinkedList<WorkflowCommand>();
		
		WorkflowCommand command = new CreateCommand(designer, "Leave Workflow");
		commands.addLast(command);
		command.execute();
		
		command = new AddStepCommand(designer, "Create Leave application");
		commands.addLast(command);
		command.execute();
		
		command = new AddStepCommand(designer, "Submit application");
		commands.addLast(command);
		command.execute();

		command = new AddStepCommand(designer, "Application Approved");
		commands.addLast(command);
		command.execute();
		
		return commands;
	}

	private static void undoLastCommand(LinkedList<WorkflowCommand> commands) {
		if(!commands.isEmpty())
			commands.removeLast().undo();
	}
}
