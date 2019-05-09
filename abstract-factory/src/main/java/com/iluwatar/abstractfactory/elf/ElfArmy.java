package com.iluwatar.abstractfactory.elf;

import com.iluwatar.abstractfactory.api.Army;

class ElfArmy implements Army {
	static final String DESCRIPTION = "This is the Elven Army!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
