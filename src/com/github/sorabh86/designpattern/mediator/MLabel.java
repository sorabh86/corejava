package com.github.sorabh86.designpattern.mediator;

import javafx.scene.control.Label;

// ConcreteColleague
public class MLabel extends Label implements UIControl {

	private UIMediator mediator;
	
	public MLabel(UIMediator mediator) {
		this.mediator = mediator;
		this.setMinWidth(100);
		this.setText("Label");
		
		// As soon it created register in mediator
		this.mediator.register(this);
	}

	// Mediator call this method on change of value in other memebers
	@Override
	public void controlChanged(UIControl control) {
		this.setText(control.getControlValue());
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "MLabel";
	}

	
	
}
