package com.iluwatar.acyclicvisitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hayes extends Modem {
	private static final Logger LOGGER = LoggerFactory.getLogger(Hayes.class);

	/**
	 * Accepts all visitors but honors only ZoomVisitor
	 */

	@Override
	public void accept(ModemVisitor modemVisitor) {
		if(modemVisitor instanceof HayesVisitor)
			((HayesVisitor) modemVisitor).visit(this);
		else 
			LOGGER.info("Only HayesVisitor is allowed to visit Hayes modem");
	}
}
