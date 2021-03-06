package sumana;

import sumana.meals.Meal;
import sumana.meals.builders.MealBuilder;

public class Main {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		System.out.println("--------first order--------");
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("cost: " + vegMeal.getCost());
		
		System.out.println("--------second order--------");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("cost: " + nonVegMeal.getCost());
		
	}
}
