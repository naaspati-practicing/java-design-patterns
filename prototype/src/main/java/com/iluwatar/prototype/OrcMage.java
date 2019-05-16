package com.iluwatar.prototype;

public class OrcMage extends Mage {
	private final String weaon;
	
	public OrcMage(String weaon) {
		this.weaon = weaon;
	}
	public OrcMage(OrcMage mage) {
		this.weaon = mage.weaon;
	}

	@Override
	public OrcMage copy() throws CloneNotSupportedException {
		return new OrcMage(this);
	}
	@Override
	  public String toString() {
	    return "Orcish mage attacks with " + weaon;
	  }

}
