package com.iluwatar.mediator;

public interface Party {
	void addMember(PartyMember member);
	void act(PartyMember member, Action action);
}
