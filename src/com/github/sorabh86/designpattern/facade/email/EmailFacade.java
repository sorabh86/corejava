package com.github.sorabh86.designpattern.facade.email;

import com.github.sorabh86.designpattern.facade.Order;
import com.github.sorabh86.designpattern.facade.email.TemplateFactory.TemplateType;

//Facade provides simple methods for client to use
public class EmailFacade {

	//Method handles interactions with subsystem classes
	public boolean sendOrderEmail(Order order) {
		Template template = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
				.withTemplate(template)
				.withStationary(stationary)
				.forObject(order)
				.build();
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
