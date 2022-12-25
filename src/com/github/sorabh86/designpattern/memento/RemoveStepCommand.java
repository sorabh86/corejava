package com.github.sorabh86.designpattern.memento;

public class RemoveStepCommand extends AbstractWorkflowCommand {

	private String step;
	
	public RemoveStepCommand(WorkflowDesigner designer, String step) {
		super(designer);
		this.step = step;
	}
	
	@Override
	public void execute() {
		memento = receiver.getMemento();
		receiver.removeStep(step);
	}

}
