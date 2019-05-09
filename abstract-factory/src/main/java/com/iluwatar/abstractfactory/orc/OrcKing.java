package com.iluwatar.abstractfactory.orc;

import com.iluwatar.abstractfactory.api.King;

class OrcKing implements King {
	static final String DESCRIPTION = "This is the Orc king!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
