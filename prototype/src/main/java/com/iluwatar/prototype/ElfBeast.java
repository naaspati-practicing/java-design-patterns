package com.iluwatar.prototype;

public class ElfBeast extends Beast {
	private final String helpType;
	
	public ElfBeast(String helpType) {
		this.helpType = helpType;
	}
	public ElfBeast(ElfBeast beast) {
		this.helpType = beast.helpType;
	}

	@Override
	public ElfBeast copy() throws CloneNotSupportedException {
		return new ElfBeast(this);
	}
	@Override
	  public String toString() {
	    return "Elven eagle helps in " + helpType;
	  }

}
