package ca.uwaterloo.cs446.designpatterns.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DecoratorTest {
	private HotBeverage black;
	private HotBeverage wMilk;
	private HotBeverage wSugar;
	private HotBeverage wMilkAndSugar;
	
	@Before
	public void setUp() throws Exception {
		black = new BlackCoffee();
		wMilk = new AddMilk(black);
		wSugar = new AddSugar(black);
		wMilkAndSugar = new AddMilk(wSugar);
	}

	@Test
	public void test() {
		// Check costs
		assertEquals(black.getCost(), 2.0, 0.001);
		assertEquals(wMilk.getCost(), 2.5, 0.001);
		assertEquals(wSugar.getCost(), 2.25, 0.001);
		assertEquals(wMilkAndSugar.getCost(), 2.75, 0.001);
		
		// Check ingredients
		List<String> blackIngredients = new ArrayList<String>();
		blackIngredients.add("Coffee");
		checkIngredientsMatch(blackIngredients, black.getIngredients());
		
		List<String> wMilkIngredients = new ArrayList<String>(blackIngredients);
		wMilkIngredients.add("Milk");
		checkIngredientsMatch(wMilkIngredients, wMilk.getIngredients());
		
		List<String> wSugarIngredients = new ArrayList<String>(blackIngredients);
		wSugarIngredients.add("Sugar");
		checkIngredientsMatch(wSugarIngredients, wSugar.getIngredients());
		
		List<String> wMilkAndSugarIngredients = new ArrayList<String>(wSugarIngredients);
		wMilkAndSugarIngredients.add("Milk");
		checkIngredientsMatch(wMilkAndSugarIngredients, wMilkAndSugar.getIngredients());
	}
	
	private void checkIngredientsMatch(List<String> ing1, List<String> ing2) {
		assertEquals(ing1.size(), ing2.size());
		
		for(String ingredient : ing1) {
			assertTrue(ing2.contains(ingredient));
		}
	}
}
