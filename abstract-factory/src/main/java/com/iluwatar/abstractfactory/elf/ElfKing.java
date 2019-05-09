package com.iluwatar.abstractfactory.elf;

import com.iluwatar.abstractfactory.api.King;

class ElfKing implements King {
	static final String DESCRIPTION = "This is the Elven king!";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
