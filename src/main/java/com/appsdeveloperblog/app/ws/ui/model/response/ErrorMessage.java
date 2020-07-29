package com.appsdeveloperblog.app.ws.ui.model.response;

import java.util.Date;

public class ErrorMessage {

	private Date timesStamp;
	private String message;

	public ErrorMessage() {}
	
	
	public ErrorMessage(Date timesStamp, String message) {

		this.timesStamp = timesStamp;
		this.message = message;
	}

	public Date getTimesStamp() {
		return timesStamp;
	}

	public void setTimesStamp(Date timesStamp) {
		this.timesStamp = timesStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
