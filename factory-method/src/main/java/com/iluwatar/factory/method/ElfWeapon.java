package com.iluwatar.factory.method;

public class ElfWeapon implements Weapon {
	private WeaponType weaponType;

	public ElfWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Elven " + weaponType;
	}

	@Override
	public WeaponType getType() {
		return weaponType;
	}

}
