package com.iluwatar.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenCartOperator extends DwarvenMineWorker {
	private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenCartOperator.class);

	@Override
	protected String name() {
		return "Dwarf cart operator";
	}

	@Override
	public void work() {
		LOGGER.info("{} moves gold chunks out of the mine.", name());
	}
}
