package com.iluwatar.acyclicvisitor;

public abstract class Modem {
	public abstract void accept(ModemVisitor modemVisitor);
	
	@Override
	  public String toString() {
	    return getClass().getSimpleName().concat(" modem");
	  }
}
