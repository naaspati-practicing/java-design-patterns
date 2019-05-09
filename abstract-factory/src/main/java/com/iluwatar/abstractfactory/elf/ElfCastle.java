package com.iluwatar.abstractfactory.elf;

import com.iluwatar.abstractfactory.api.Castle;

class ElfCastle implements Castle {
	static final String DESCRIPTION = "This is the Elven castle!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
