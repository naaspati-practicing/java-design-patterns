package com.iluwatar.chain;

public class OrcSoldier extends RequestHandler {

	public OrcSoldier(RequestHandler next) {
		super(next);
	}

	@Override
	public void handleRequest(Request request) {
		if(request.getType() == RequestType.COLLECT_TAX) {
			printHandling(request);
			request.setHandled();
		} else 
			super.handleRequest(request);
	}

	@Override
	public String toString() {
		return "Orc soldier";
	}

}
