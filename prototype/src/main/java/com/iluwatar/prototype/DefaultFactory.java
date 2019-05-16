package com.iluwatar.prototype;

public class DefaultFactory implements Factory {
	
	private final Mage mage;
	private final Beast beast;
	private final Warlord warlord;

	public DefaultFactory(Mage mage, Beast beast, Warlord warlord) {
		this.mage = mage;
		this.beast = beast;
		this.warlord = warlord;
	}

	@Override
	public Mage createMage() {
		return copy(mage);
	}

	@SuppressWarnings("unchecked")
	private <E extends Prototype> E copy(E e) {
		try {
			return (E) e.copy();
		} catch (CloneNotSupportedException e1) {
			throw new RuntimeException(e1);
		}
	}

	@Override
	public Warlord createWarlord() {
		return copy(warlord);
	}

	@Override
	public Beast createBeast() {
		return copy(beast);
	}

}
