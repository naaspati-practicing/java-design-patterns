package com.iluwatar.composite;

import java.util.List;

public class Word extends LetterComposite {
	public Word(List<Letter> letters) {
		letters.forEach(this::add);
	}
	@Override
	protected void printThisBefore() {
		System.out.print(" ");
	}

}
