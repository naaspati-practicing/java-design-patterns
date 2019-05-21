package com.iluwatar.proxy

import spock.lang.Specification

class WizardSpec extends Specification {
	
	 def 'check if toString of wizard return its name' () {
		 given:
		 def w = new Wizard(name)
		 
		 expect:
		 w.toString().is(name)
		 
		 where:
		 name << ["Gandalf", "Dumbledore", "Oz", "Merlin"]
	 }
}
