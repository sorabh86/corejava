package com.github.sorabh86.designpattern.mediator;

import javafx.scene.control.TextField;

// ConcreteColleague
public class MTextBox extends TextField implements UIControl {

	private UIMediator mediator;
	
	private boolean mediatedUpdate;
	
	public MTextBox(UIMediator mediator) {
		this.mediator = mediator;
		this.setText("Textbox");
		
		// As soon it created register in mediator
		this.mediator.register(this);
		
		// adding observer on value
		this.textProperty().addListener((value, oldValue, newValue) -> {
			if(!mediatedUpdate) 
				this.mediator.valueChanged(this);
		});
	}

	// Mediator call this method on change of value in other memebers
	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		this.setText(control.getControlValue());
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "TextBox";
	}

	
	
}
