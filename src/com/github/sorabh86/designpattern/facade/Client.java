package com.github.sorabh86.designpattern.facade;

import com.github.sorabh86.designpattern.facade.email.Email;
import com.github.sorabh86.designpattern.facade.email.EmailFacade;
import com.github.sorabh86.designpattern.facade.email.Mailer;
import com.github.sorabh86.designpattern.facade.email.Stationary;
import com.github.sorabh86.designpattern.facade.email.StationaryFactory;
import com.github.sorabh86.designpattern.facade.email.Template;
import com.github.sorabh86.designpattern.facade.email.TemplateFactory;
import com.github.sorabh86.designpattern.facade.email.TemplateFactory.TemplateType;

public class Client {
	
	public static void main(String[] args) {
		Order order = new Order("230", 39.99F);
		boolean result = sendOrderEamilWithoutFacade(order);
		System.out.println("Order Email status: "+result+", Message: "+(result?"Sent!":"Failure!"));
		
		// Send email using EmailFacade
		boolean res = (new EmailFacade()).sendOrderEmail(order);
		System.out.println("Email send using EmailFacade, status: "+res);
	}
	
	private static boolean sendOrderEamilWithoutFacade(Order order) {
		Template tpl = TemplateFactory.createTemplateFor(TemplateType.Email);
		Stationary stationary = StationaryFactory.createStationary();
		Email email = Email.getBuilder()
				.withTemplate(tpl)
				.withStationary(stationary)
				.forObject(order)
				.build();
		
		Mailer mailer = Mailer.getMailer();
		return mailer.send(email);
	}
}
