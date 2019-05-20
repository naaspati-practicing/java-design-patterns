package com.iluwatar.facade

import static org.junit.Assert.*

import org.junit.Test

import spock.lang.Specification
import uk.org.lidalia.slf4jtest.LoggingEvent
import uk.org.lidalia.slf4jtest.TestLogger
import uk.org.lidalia.slf4jtest.TestLoggerFactory

class DwarvenGoldmineFacadeSpec extends Specification {
	
	def 'check if DwarvenGoldmineFacade is working properly'( ) {
		given: 'a DwarvenGoldmineFacade'
		
		def dwarvenMineWorker_logger = TestLoggerFactory.getTestLogger(DwarvenMineWorker)
		
		def gold_logger = TestLoggerFactory.getTestLogger(DwarvenGoldDigger)
		def cart_logger = TestLoggerFactory.getTestLogger(DwarvenCartOperator)
		def tunnel_logger = TestLoggerFactory.getTestLogger(DwarvenTunnelDigger)
		
		def gold = new DwarvenGoldDigger()
		def cart = new DwarvenCartOperator()
		def tunnel = new DwarvenTunnelDigger()
		
		def facade = new DwarvenGoldmineFacade(gold, cart, tunnel)
		
		def wakeUp = "{} wakes up."
		def gotoMine = "{} goes to the mine."
		def goHome = "{} goes home."
		def gotoSleep = "{} goes to sleep."

		when:
		facade.startNewDay()
		facade.digOutGold()
		facade.endDay()

		then:
		dwarvenMineWorker_logger.allLoggingEvents == [
			// On the start of a day, all workers should wake up ...
			info(wakeUp, gold.name()),
			info(gotoMine, gold.name()),
			
			info(wakeUp, cart.name()),
			info(gotoMine, cart.name()),
			
			info(wakeUp, tunnel.name()),
			info(gotoMine, tunnel.name()),
			
			info(goHome, gold.name()),
			info(gotoSleep, gold.name()),
			
			info(goHome, cart.name()),
			info(gotoSleep, cart.name()),
			
			info(goHome, tunnel.name()),
			info(gotoSleep, tunnel.name()),
		]
		
		gold_logger.allLoggingEvents == [info("{} digs for gold.", gold.name())]
		tunnel_logger.allLoggingEvents == [info("{} creates another promising tunnel.", tunnel.name())]
		cart_logger.allLoggingEvents == [info("{} moves gold chunks out of the mine.", cart.name())]
	}
	
	LoggingEvent info(msg, args) {
		return LoggingEvent.info(msg, args)
	}
}
