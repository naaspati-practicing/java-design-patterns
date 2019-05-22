package com.iluwatar.chain;

public class OrcCommander extends RequestHandler {

	public OrcCommander(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType() == RequestType.DEFEND_CASTLE) {
			printHandling(request);
			request.setHandled();
		} else 
			super.handleRequest(request);
	}

	@Override
	public String toString() {
		return "Orc commander";
	}

}
