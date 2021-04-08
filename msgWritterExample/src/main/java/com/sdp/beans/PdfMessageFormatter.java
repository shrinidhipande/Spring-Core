package com.sdp.beans;

public class PdfMessageFormatter implements IMessageFormatter {

	public String formatMessage(String message) {
		return "<PDF> " + message + "</PDF>";
	}

}
