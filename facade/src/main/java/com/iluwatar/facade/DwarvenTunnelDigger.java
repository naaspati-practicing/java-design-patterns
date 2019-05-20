package com.iluwatar.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
	private static final Logger LOGGER = LoggerFactory.getLogger(DwarvenTunnelDigger.class);

	@Override
	protected String name() {
		return "Dwarven tunnel digger";
	}

	@Override
	public void work() {
		LOGGER.info("{} creates another promising tunnel.", name());
	}
}
