package com.github.sorabh86.designpattern.memento;

import java.util.Arrays;
import java.util.LinkedList;

// GUI representation of application
// It represent sequence of steps to be followed in order to complete a business process
public class Workflow {
	
	private LinkedList<String> steps;
	private String name;
	
	public Workflow(String name) {
		this.name = name;
		this.steps = new LinkedList<String>();
	}
	
	public Workflow(String name, String... steps) {
		this.name = name;
		this.steps = new LinkedList<String>();
		if(steps != null && steps.length > 0) {
			Arrays.stream(steps).forEach(s->this.steps.add(s));
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Workflow [name=");
		builder.append(name).append("]\nBEGIN -> ");
		for(String step : steps)
			builder.append(step).append(" -> ");
		
		return builder.toString();
	}

	public void addStep(String step) {
		// TODO Auto-generated method stub
		
	}

	public void removeStep(String step) {
		// TODO Auto-generated method stub
		
	}

	public String[] getSteps() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
