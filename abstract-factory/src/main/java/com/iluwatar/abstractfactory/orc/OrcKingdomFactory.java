package com.iluwatar.abstractfactory.orc;

import com.iluwatar.abstractfactory.api.Army;
import com.iluwatar.abstractfactory.api.Castle;
import com.iluwatar.abstractfactory.api.King;
import com.iluwatar.abstractfactory.api.KingdomFactory;

public class OrcKingdomFactory implements KingdomFactory {

	@Override
	public Castle createCastle() {
		return new OrcCastle();
	}
	@Override
	public King createKing() {
		return new OrcKing();
	}
	@Override
	public Army createArmy() {
		return new OrcArmy();
	}
}
