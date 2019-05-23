package com.iluwatar.mediator

import spock.lang.Specification

class PartyImplSpec extends Specification {
	
	def 'check party action' () {
		given: 'two members'
		def pm1 = Mock(PartyMember)
		def pm2 = Mock(PartyMember)
		
		and: 'a party'
		def party = new PartyImpl()
		
		when: 'members added to party'
		party.addMember(pm1)
		party.addMember(pm2)
		
		and: 'party acts from member1 to member2'
		party.act(pm1, Action.GOLD)
		
		then: 'members joined party'
		1 * pm1.joinedParty(party)
		1 * pm2.joinedParty(party)
		
		and: 'member2 acts'
		0 * pm1.partyAction(_)
		1 * pm2.partyAction(Action.GOLD)
	}
}
