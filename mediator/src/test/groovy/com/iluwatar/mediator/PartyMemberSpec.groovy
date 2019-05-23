package com.iluwatar.mediator

import spock.lang.Shared
import spock.lang.Specification
import uk.org.lidalia.slf4jtest.LoggingEvent
import uk.org.lidalia.slf4jtest.TestLogger
import uk.org.lidalia.slf4jtest.TestLoggerFactory

class PartyMemberSpec extends Specification {
	@Shared 
	TestLogger logger = TestLoggerFactory.getTestLogger(PartyMemberBase)
	
	def 'test action'() {
		given:
		logger.clearAll()
		def member = cls.newInstance()
		
		when: 'member performs action'
		member.partyAction(action)
		
		then:
		logger.allLoggingEvents == [LoggingEvent.info("{} {}", member, action.getDescription())]
		
		where: 
		[cls,action] << data()
	}
	
	private List data() {
		def list = []
		[Hobbit, Hunter, Rogue, Wizard]
		.each{k -> Action.values().each{m -> list.add([k, m])}}
		
		return list;
	}
}
