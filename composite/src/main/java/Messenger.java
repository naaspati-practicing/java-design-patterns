import java.util.Arrays;

import com.iluwatar.composite.Letter;
import com.iluwatar.composite.LetterComposite;
import com.iluwatar.composite.Sentence;
import com.iluwatar.composite.Word;

public class Messenger {
	
	public LetterComposite messageFromOrcs() {
		return new Sentence(Arrays.asList(
				word('W', 'h', 'e', 'r', 'e'),
				word('t', 'h', 'e',  'r', 'e'),
				word('i', 's'),
				word('a'),
				word('w', 'h', 'i',  'p'),
				word('t', 'h', 'e',  'r', 'e'),
				word('i', 's'),
				word('a'),
				word('w', 'a', 'y')
				));
	}
	
	LetterComposite messageFromElves() { 
		return new Sentence(Arrays.asList(
				word('M', 'u', 'c',  'h'),
				word('w', 'i', 'n',  'd'),
				word('p', 'o', 'u',  'r', 's'),
				word('f', 'r', 'o',  'm'),
				word('y', 'o', 'u',  'r'),
				word('m', 'o', 'u',  't', 'h')
				));
	}

	private Word word(char...cs) {
		Letter[] letters = new Letter[cs.length];
		for (int i = 0; i < letters.length; i++) 
			letters[i] = new Letter(cs[i]);
		
		return new Word(Arrays.asList(letters));
	}

}
