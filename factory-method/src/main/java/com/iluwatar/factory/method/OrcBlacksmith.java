package com.iluwatar.factory.method;

public class OrcBlacksmith implements Blacksmith {

	@Override
	public Weapon create(WeaponType type) {
		return new OrcWeapon(type);
	}
}
