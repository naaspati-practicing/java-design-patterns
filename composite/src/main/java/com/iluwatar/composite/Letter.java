package com.iluwatar.composite;

public class Letter extends LetterComposite {
	private final char c;

	public Letter(char c) {
		this.c = c;
	}
	
	@Override
	protected void printThisAfter() {
		System.out.print(c);
	}

}
