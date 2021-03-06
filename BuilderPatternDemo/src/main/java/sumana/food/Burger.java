package sumana.food;

import sumana.items.Item;
import sumana.packs.Packing;
import sumana.packs.impl.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract Float price();
}
