package com.sdp.beans;

public class HtmlMessageFormatter implements IMessageFormatter {
	
	public String formatMessage(String message) {
		return "<HTML><BODY> "+message+"</BODY></HTML>";
	}

}
