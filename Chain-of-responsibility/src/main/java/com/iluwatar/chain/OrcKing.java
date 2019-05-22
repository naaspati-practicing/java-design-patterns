package com.iluwatar.chain;

public class OrcKing {
	private final RequestHandler handler;
	
	public OrcKing() {
		this.handler = buildChain();
		
	}

	private RequestHandler buildChain() {
		return new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
	}
	public void makeRequest(Request request) {
		handler.handleRequest(request);
	}
}
