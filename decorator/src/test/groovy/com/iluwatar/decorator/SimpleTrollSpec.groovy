package com.iluwatar.decorator

import spock.lang.Specification
import uk.org.lidalia.slf4jtest.TestLogger
import uk.org.lidalia.slf4jtest.TestLoggerFactory

class SimpleTrollSpec extends Specification {
	SimpleTroll troll;
	TestLogger logger;
	
	def setup() {
		troll = new SimpleTroll();
		logger = TestLoggerFactory.getTestLogger(SimpleTroll)
	}
	
	def 'troll power must be 10' () {
		expect:
		troll.attackPower == 10
	}
	
	def 'check if attack is working' () {
		when:
		troll.attack()
		
		then:
		logger.loggingEvents.collect{it.message} == ["The troll tries to grab you!"]
	}
	
	def 'check if flee is working' () {
		when:
		troll.fleeBattle()
		
		then:
		logger.loggingEvents.collect{it.message} == ["The troll shrieks in horror and runs away!"]
	}
	
	def cleanup() {
		logger.clear()
	}
}
