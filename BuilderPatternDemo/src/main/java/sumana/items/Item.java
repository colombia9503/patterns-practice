package sumana.items;

import sumana.packs.Packing;

public interface Item {
	public String name();
	public Packing packing();
	public Float price();
}
