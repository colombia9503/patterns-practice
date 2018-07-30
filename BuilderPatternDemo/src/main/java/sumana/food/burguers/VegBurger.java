package sumana.food.burguers;

import sumana.food.Burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Vegetarian Burguer";
	}

	@Override
	public Float price() {
		return 5500f;
	}

}
