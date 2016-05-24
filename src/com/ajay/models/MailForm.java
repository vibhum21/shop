package com.ajay.models;

public class MailForm {

	private String to;
	private String from;
	private String message;
	private String subject;
	private String smptserv;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSmptserv() {
		return smptserv;
	}
	public void setSmptserv(String smptserv) {
		this.smptserv = smptserv;
	}
	
}
