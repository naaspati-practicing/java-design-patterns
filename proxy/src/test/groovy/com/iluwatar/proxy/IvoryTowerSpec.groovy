package com.iluwatar.proxy

import spock.lang.Shared
import spock.lang.Specification
import uk.org.lidalia.slf4jtest.LoggingEvent
import uk.org.lidalia.slf4jtest.TestLogger
import uk.org.lidalia.slf4jtest.TestLoggerFactory

class IvoryTowerSpec extends Specification {
	@Shared
	TestLogger logger = TestLoggerFactory.getTestLogger(IvoryTower)

	def 'test enter'() {
		given: 'a tower'

		TestLoggerFactory.clearAll()
		def tower = new IvoryTower()
		def wizard = new Wizard(name)
		
		when: 'wizard enters tower'
		tower.enter(wizard)
		
		then: 'tower reports entry'
		logger.allLoggingEvents == [LoggingEvent.info("{} enters the tower.", wizard)]
		
		where:
		name << ["Gandalf", "Dumbledore", "Oz", "Merlin"]
	}
}
