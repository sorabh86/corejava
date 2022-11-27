package com.github.sorabh86.designpattern.mediator;

import javafx.scene.control.Slider;

// ConcreteColleague
public class MSlider extends Slider implements UIControl {

	private UIMediator mediator;
	
	private boolean mediatedUpdate;
	
	public MSlider(UIMediator mediator) {
		this.mediator = mediator;
		this.setMin(0);
		this.setMax(100);
		this.setBlockIncrement(5);
		
		// As soon it created register in mediator
		this.mediator.register(this);
		
		// adding observer on value
		this.valueProperty().addListener((value, oldValue, newValue) -> {
			if(!mediatedUpdate) 
				this.mediator.valueChanged(this);
		});
	}

	// Mediator call this method on change of value in other memebers
	@Override
	public void controlChanged(UIControl control) {
		this.mediatedUpdate = true;
		try {
			this.setValue(Double.valueOf(control.getControlValue()));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		this.mediatedUpdate = false;
	}

	@Override
	public String getControlValue() {
		return Double.toString(this.getValue());
	}

	@Override
	public String getControlName() {
		return "MSlider";
	}

	
	
}
