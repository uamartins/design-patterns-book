package bg.designpatternsbook.builder;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import bg.designpatternsbook.builder.flight.FlightSearch;
import bg.designpatternsbook.builder.pizza.CapricciosaPizzaBuilder;
import bg.designpatternsbook.builder.pizza.HawaiiPizzaBuilder;
import bg.designpatternsbook.builder.pizza.PepperoniPizzaBuilder;
import bg.designpatternsbook.builder.pizza.Pizza;
import bg.designpatternsbook.builder.pizza.PizzaBuilder;
import bg.designpatternsbook.builder.pizza.PizzaShop;

public class Main {
	
	public static void main(String [ ] args) {
	    // Flight Search example
		FlightSearch search = new FlightSearch.Builder("Sofia", "Paris")
		    .numOfAdultPassangers(2)
			.departureDate(new GregorianCalendar(2012, 2, 5).getTime())
			.returnDate(new GregorianCalendar(2012, 2, 10).getTime())
			.buildSearch();
		
		// Pizza builder example
		List<Pizza> pizzas = new ArrayList<Pizza>();
		PizzaBuilder builder;
		
		PizzaShop shop = new PizzaShop();
		
		builder = new PepperoniPizzaBuilder();
		shop.constructPizza(builder);
		pizzas.add(builder.getPizza());
		
	    builder = new HawaiiPizzaBuilder();
	    shop.constructPizza(builder);
	    pizzas.add(builder.getPizza());
	    
	    builder = new CapricciosaPizzaBuilder();
	    shop.constructPizza(builder);
	    pizzas.add(builder.getPizza());
	    
	    for (Pizza pizza: pizzas) {
	        System.out.println(pizza);
	    }
	}

}
