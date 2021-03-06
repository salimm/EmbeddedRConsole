package com.ers.console.webEngineWrapper.msg;


public class RConsoleResponse {

	private String text;
	private RConsoleResponseType type;
	private RConsoleResponseStatus status;

	public RConsoleResponse(String text, RConsoleResponseType type,
			RConsoleResponseStatus status) {
		this.setText(text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t"));
		this.setType(type);
		this.setStatus(status);

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text.replaceAll("\n", "\\\\n").replaceAll("\r", "\\\\r").replaceAll("\t", "\\\\t");
	}

	public RConsoleResponseType getType() {
		return type;
	}

	public void setType(RConsoleResponseType type) {
		this.type = type;
	}

	public RConsoleResponseStatus getStatus() {
		return status;
	}

	public void setStatus(RConsoleResponseStatus status) {
		this.status = status;
	}

	public String toJSON() {
		return "{\"txt\": \"" + getText() + "\", \"type\": \""
				+ getType().toString() + "\", \"status\": \""
				+ getStatus().toString() + "\"}";
	}

}
