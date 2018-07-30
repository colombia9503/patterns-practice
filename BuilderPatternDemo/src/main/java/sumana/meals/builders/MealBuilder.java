package sumana.meals.builders;

import sumana.food.burguers.ChickenBurger;
import sumana.food.burguers.VegBurger;
import sumana.food.drinks.Coke;
import sumana.food.drinks.Pepsi;
import sumana.meals.Meal;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
