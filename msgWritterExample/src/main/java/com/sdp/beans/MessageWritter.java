package com.sdp.beans;

public class MessageWritter {

	IMessageFormatter messageFormatter = null;
	
	public void writeMessage(String message) {
		
		String formattedMessage = null;
		
		formattedMessage = messageFormatter.formatMessage(message);
		
		System.out.println(formattedMessage);
		
	}
	
	public void setMessageFormatter(IMessageFormatter messageFormatter) {
		this.messageFormatter = messageFormatter;
	}
	
}
