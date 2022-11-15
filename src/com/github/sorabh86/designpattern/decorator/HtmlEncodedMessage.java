package com.github.sorabh86.designpattern.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

// Decorator. Implements component interface
@SuppressWarnings("deprecation")
public class HtmlEncodedMessage implements Message{

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}
}
