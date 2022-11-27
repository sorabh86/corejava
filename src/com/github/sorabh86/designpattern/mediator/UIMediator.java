package com.github.sorabh86.designpattern.mediator;

import java.util.ArrayList;
import java.util.List;

// ConcreateMediator
public class UIMediator {
	
	// save reference of all members
	List<UIControl> colleagues = new ArrayList<>();
	
	// job is to register new colleagues
	public void register(UIControl control) {
		colleagues.add(control);
	}
	
	// Job of is to tell collegues some value have been changed
	public void valueChanged(UIControl control) {
		colleagues.stream().filter(c -> c != control)
			.forEach(c -> c.controlChanged(control));
	}
}
