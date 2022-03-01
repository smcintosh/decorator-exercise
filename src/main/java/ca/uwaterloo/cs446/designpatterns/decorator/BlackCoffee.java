package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

// The "ConcreteComponent" class
public class BlackCoffee implements HotBeverage {
	@Override
	public double getCost() {
		return 2.00;
	}

	@Override
	public List<String> getIngredients() {
		List<String> ingredients = new ArrayList<String>();
		ingredients.add("Coffee");
		
		return ingredients;
	}
}
