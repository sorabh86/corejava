package com.github.sorabh86.designpattern.prototype;

// This class doesn't support cloning
public class NormalMan extends GameUnit {
	
	private String state="idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}

	@Override
	public String toString() {
		return "NormalMan [state=" + state + ", getPosition()=" + getPosition() + "]";
	}

	@Override
	protected GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("NormalMan are unique");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported");
	}
	
}
