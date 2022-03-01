package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.List;

public class AddMilk extends HotBeverageDecorator {
	public AddMilk(HotBeverage beverage) {
		super(beverage);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.5;
	}
	
	@Override
	public List<String> getIngredients() {
		List<String> ingredients = super.getIngredients();
		ingredients.add("Milk");
		
		return ingredients;
	}
}
