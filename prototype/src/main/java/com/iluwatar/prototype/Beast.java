package com.iluwatar.prototype;

public abstract class Beast extends Prototype {
	@Override
	public abstract Beast copy() throws CloneNotSupportedException;
}
