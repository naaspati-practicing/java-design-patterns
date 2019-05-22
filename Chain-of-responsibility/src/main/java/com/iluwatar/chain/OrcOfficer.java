package com.iluwatar.chain;

public class OrcOfficer extends RequestHandler {

	public OrcOfficer(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType() == RequestType.TORTURE_PRISONER) {
			printHandling(request);
			request.setHandled();
		} else 
			super.handleRequest(request);
	}

	@Override
	public String toString() {
		return "Orc officer";
	}

}
