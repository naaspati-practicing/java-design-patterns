package com.iluwatar.prototype;

public class OrcBeast extends Beast {
	private final String weaon;
	
	public OrcBeast(String weaon) {
		this.weaon = weaon;
	}
	public OrcBeast(OrcBeast beast) {
		this.weaon = beast.weaon;
	}

	@Override
	public OrcBeast copy() throws CloneNotSupportedException {
		return new OrcBeast(this);
	}
	@Override
	  public String toString() {
	    return "Orcish wolf attacks with " + weaon;
	  }

}
