import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iluwatar.flyweight.AlchemistShop;
import com.iluwatar.flyweight.Potion;

public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		AlchemistShop shop = new AlchemistShop();
		
		LOGGER.info("TOP SHELF");
		shop.forEachTopShelf(Potion::drink);
		
		LOGGER.info("BOTTOM SHELF");
		shop.forEachBottomShelf(Potion::drink);
	}

}
