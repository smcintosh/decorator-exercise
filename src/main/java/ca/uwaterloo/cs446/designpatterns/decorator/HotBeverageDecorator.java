package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.List;

public abstract class HotBeverageDecorator implements HotBeverage {
	
	protected final HotBeverage decoratedBeverage;
	
	public HotBeverageDecorator(HotBeverage beverage) {
		this.decoratedBeverage = beverage;
	}
	
	@Override
	public double getCost() {
		return decoratedBeverage.getCost();
	}

	@Override
	public List<String> getIngredients() {
		return decoratedBeverage.getIngredients();
	}
}
