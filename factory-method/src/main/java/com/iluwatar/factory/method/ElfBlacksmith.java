package com.iluwatar.factory.method;

public class ElfBlacksmith implements Blacksmith {

	@Override
	public Weapon create(WeaponType type) {
		return new ElfWeapon(type);
	}
}
