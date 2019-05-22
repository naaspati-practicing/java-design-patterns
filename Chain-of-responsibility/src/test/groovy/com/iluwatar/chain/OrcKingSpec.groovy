package com.iluwatar.chain

import spock.lang.Specification

class OrcKingSpec extends Specification {
	def 'basic check' () {
		given: 'Orc King'
		def king = new OrcKing()

		expect:
		!req.isHandled()

		when: 'make request'
		king.makeRequest(req)

		then: 'reqest is handled'
		req.isHandled()

		where:
		req << [
			new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
			new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
			new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ...")
		]
	}
}
