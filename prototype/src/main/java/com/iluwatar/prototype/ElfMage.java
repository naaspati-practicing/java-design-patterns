package com.iluwatar.prototype;

public class ElfMage extends Mage {
	private final String helpType;
	
	public ElfMage(String helpType) {
		this.helpType = helpType;
	}
	public ElfMage(ElfMage mage) {
		this.helpType = mage.helpType;
	}

	@Override
	public Mage copy() throws CloneNotSupportedException {
		return new ElfMage(this);
	}
	@Override
	  public String toString() {
	    return "Elven mage helps in " + helpType;
	  }

}
