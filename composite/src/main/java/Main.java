import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		System.out.println("Message from the orcs: ");
		
		Messenger m = new Messenger();
		m.messageFromOrcs().print();
		
		System.out.println("\nMessage from the elves: ");
		m.messageFromElves().print();
	}

}
