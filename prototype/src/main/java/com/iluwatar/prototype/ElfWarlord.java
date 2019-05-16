package com.iluwatar.prototype;

public class ElfWarlord extends Warlord {
	private final String helpType;
	
	public ElfWarlord(String helpType) {
		this.helpType = helpType;
	}
	public ElfWarlord(ElfWarlord mage) {
		this.helpType = mage.helpType;
	}

	@Override
	public Warlord copy() throws CloneNotSupportedException {
		return new ElfWarlord(this);
	}
	@Override
	  public String toString() {
	    return "Elven warlord helps in " + helpType;
	  }

}
