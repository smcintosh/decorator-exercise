package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.List;

// The "Component" interface
public interface HotBeverage {
	public double getCost();
	public List<String> getIngredients();
}
