package sumana.packs.impl;

import sumana.packs.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "wrapped";
	}

}
