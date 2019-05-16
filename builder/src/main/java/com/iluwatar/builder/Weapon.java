package com.iluwatar.builder;

public enum Weapon {
	DAGGER, SWORD, AXE, WARHAMMER, BOW;
	
	@Override
	public String toString() {
		return super.toString().toLowerCase();
	}
}
