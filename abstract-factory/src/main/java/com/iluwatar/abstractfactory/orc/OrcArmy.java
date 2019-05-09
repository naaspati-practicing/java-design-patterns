package com.iluwatar.abstractfactory.orc;

import com.iluwatar.abstractfactory.api.Army;

class OrcArmy implements Army {
	static final String DESCRIPTION = "This is the Orc Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
