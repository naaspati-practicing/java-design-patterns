package com.iluwatar.abstractfactory.api;

public interface KingdomFactory {
	Castle createCastle();
	King createKing();
	Army createArmy();
}
