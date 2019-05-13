import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.iluwatar.bridge.FlyingEnchantment;
import com.iluwatar.bridge.Hammer;
import com.iluwatar.bridge.SoulEatingEnchantment;
import com.iluwatar.bridge.Sword;

public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		LOGGER.info("The knight receives an enchanted sword.");
	    Sword enchantedSword = new Sword(new SoulEatingEnchantment());
	    enchantedSword.wield();
	    enchantedSword.swing();
	    enchantedSword.unwield();

	    LOGGER.info("The valkyrie receives an enchanted hammer.");
	    Hammer hammer = new Hammer(new FlyingEnchantment());
	    hammer.wield();
	    hammer.swing();
	    hammer.unwield();
	}
}
