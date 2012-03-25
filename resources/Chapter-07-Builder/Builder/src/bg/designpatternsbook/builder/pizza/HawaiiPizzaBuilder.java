package bg.designpatternsbook.builder.pizza;

import bg.designpatternsbook.builder.pizza.Pizza;
import bg.designpatternsbook.builder.pizza.PizzaBuilder;

public class HawaiiPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();
    
    @Override
    public PizzaBuilder buildDough() {
        pizza.ingredients.add("easy pizza dough");
        
        return this;
    }

    @Override
    public PizzaBuilder buildSauce() {
        pizza.ingredients.add("tomato sauce");
        
        return this;
    }

    @Override
    public PizzaBuilder buildTopping() {
        pizza.ingredients.add("cheese");
        pizza.ingredients.add("tomato");
        pizza.ingredients.add("ham");
        pizza.ingredients.add("pineapple");
        
        return this;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
