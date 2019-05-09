package com.iluwatar.abstractfactory.orc;

import com.iluwatar.abstractfactory.api.Castle;

class OrcCastle implements Castle {
	static final String DESCRIPTION = "This is the Orc castle!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
