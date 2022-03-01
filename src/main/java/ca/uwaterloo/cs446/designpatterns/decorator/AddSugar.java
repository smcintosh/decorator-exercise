package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.List;

public class AddSugar extends HotBeverageDecorator {

	public AddSugar(HotBeverage beverage) {
		super(beverage);
	}
	
	@Override
	public double getCost() {
		return super.getCost() + 0.25;
	}
	
	@Override
	public List<String> getIngredients() {
		List<String> ingredients = super.getIngredients();
		ingredients.add("Sugar");
		
		return ingredients;
	}
}
