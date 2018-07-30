package sumana.food;

import sumana.items.Item;
import sumana.packs.Packing;
import sumana.packs.impl.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract Float price();

}
