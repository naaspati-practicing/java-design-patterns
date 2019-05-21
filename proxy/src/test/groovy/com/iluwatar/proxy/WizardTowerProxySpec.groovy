package com.iluwatar.proxy

import spock.lang.Specification
import uk.org.lidalia.slf4jtest.LoggingEvent
import uk.org.lidalia.slf4jtest.TestLoggerFactory
import org.codehaus.groovy.transform.sc.StaticCompilationMetadataKeys
import static uk.org.lidalia.slf4jtest.LoggingEvent.*

class WizardTowerProxySpec extends Specification {
	def 'check only limited number of wizard are allowed to enter' () {
		given: '4 wizards, and a tower proxy'
		
		def wizards = ["Gandalf", "Dumbledore", "Oz", "Merlin"].collect{new Wizard(it)}
		def tower = new WizardTowerProxy(new IvoryTower())
		
		TestLoggerFactory.clearAll()
		def ivory_logger = TestLoggerFactory.getTestLogger(IvoryTower)
		def proxy_logger = TestLoggerFactory.getTestLogger(WizardTowerProxy)
		
		when:'all wizards enters tower'
		wizards.forEach { tower.enter(it) }
		
		then: 'only three wizards are allowed to enter'
		ivory_logger.allLoggingEvents == wizards.subList(0, wizards.size() - 1).collect { info("{} enters the tower.", it) }
		proxy_logger.allLoggingEvents == [info("{} is not allowed to enter!", wizards.last())]
	}
}
