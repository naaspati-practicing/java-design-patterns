package com.iluwatar.acyclicvisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zoom extends Modem {
	private static final Logger LOGGER = LoggerFactory.getLogger(Zoom.class);

	/**
	 * Accepts all visitors but honors only HayesVisitor
	 */

	@Override
	public void accept(ModemVisitor modemVisitor) {
		if(modemVisitor instanceof ZoomVisitor)
			((ZoomVisitor) modemVisitor).visit(this);
		else 
			LOGGER.info("Only HayesVisitor is allowed to visit Hayes modem");
	}
}
