package com.iluwatar.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvisibilityPotion implements Potion {
	private static final Logger LOGGER = LoggerFactory.getLogger(InvisibilityPotion.class);
	
	@Override
	public void drink() {
		LOGGER.info("You feel blessed. (Potion={})", System.identityHashCode(this));
	}
}
