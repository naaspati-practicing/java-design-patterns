package com.iluwatar.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class RequestHandler {
	private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandler.class);
	
	private final RequestHandler next;

	public RequestHandler(RequestHandler next) {
		this.next = next;
	}
	public void handleRequest(Request request) {
		if(next != null)
			next.handleRequest(request);
	}
	protected void printHandling(Request request) {
		LOGGER.info("{} handling request \"{}\"", this, request);
	}
	
	@Override
	public abstract String toString(); 
}
