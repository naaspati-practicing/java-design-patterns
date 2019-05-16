package com.iluwatar.prototype

import spock.lang.Specification

class PrototypeTest extends Specification {
	
	 def 'test prototypes implementations' () {
		 when: 
		 def clone = expected.copy()
		 
		 then:
		 expected.toString() == expected_to_string
		 !expected.is(clone)
		 clone != null
		 expected.class == clone.class
		 
		 where: 
		 expected                     | expected_to_string
		 new OrcBeast("axe")          |  "Orcish wolf attacks with axe"
		 new OrcMage("sword")         |  "Orcish mage attacks with sword"
		 new OrcWarlord("laser")      |  "Orcish warlord attacks with laser"
		 new ElfBeast("cooking")      |  "Elven eagle helps in cooking"
		 new ElfMage("cleaning")      |  "Elven mage helps in cleaning"
		 new ElfWarlord("protecting") |  "Elven warlord helps in protecting"
	 }
}
