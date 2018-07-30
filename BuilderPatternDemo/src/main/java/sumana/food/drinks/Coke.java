package sumana.food.drinks;

import sumana.food.ColdDrink;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public Float price() {
		return 3500f;
	}

}
