package com.iluwatar.prototype;

public class OrcWarlord extends Warlord {
	private final String weaon;
	
	public OrcWarlord(String weaon) {
		this.weaon = weaon;
	}
	public OrcWarlord(OrcWarlord mage) {
		this.weaon = mage.weaon;
	}

	@Override
	public Warlord copy() throws CloneNotSupportedException {
		return new OrcWarlord(this);
	}
	@Override
	  public String toString() {
	    return "Orcish warlord attacks with " + weaon;
	  }

}
