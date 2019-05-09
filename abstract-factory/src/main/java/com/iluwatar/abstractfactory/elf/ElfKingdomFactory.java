package com.iluwatar.abstractfactory.elf;

import com.iluwatar.abstractfactory.api.Army;
import com.iluwatar.abstractfactory.api.Castle;
import com.iluwatar.abstractfactory.api.King;
import com.iluwatar.abstractfactory.api.KingdomFactory;

public class ElfKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new ElfCastle();
	}
	@Override
	public King createKing() {
		return new ElfKing();
	}
	@Override
	public Army createArmy() {
		return new ElfArmy();
	}
}
