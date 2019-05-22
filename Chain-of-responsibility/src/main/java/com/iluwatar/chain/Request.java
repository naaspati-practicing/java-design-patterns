package com.iluwatar.chain;

import java.util.Objects;

public class Request {
	private final RequestType type;
	private final String description;
	private boolean handled;
	
	public Request(RequestType type, String description) {
		this.type = Objects.requireNonNull(type);
		this.description = Objects.requireNonNull(description);
	}

	public boolean isHandled() {
		return handled;
	}
	public void setHandled() {
		this.handled = true;
	}
	public RequestType getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return description;
	}
}
