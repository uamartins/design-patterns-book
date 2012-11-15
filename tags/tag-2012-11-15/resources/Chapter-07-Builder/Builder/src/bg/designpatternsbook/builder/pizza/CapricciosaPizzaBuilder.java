package bg.designpatternsbook.builder.pizza;

public class CapricciosaPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();
    
    @Override
    public PizzaBuilder buildDough() {
        pizza.ingredients.add("Neapolitan pizza dough");
        
        return this;
    }

    @Override
    public PizzaBuilder buildSauce() {
        pizza.ingredients.add("tomato sauce");
        
        return this;
    }

    @Override
    public PizzaBuilder buildTopping() {
        pizza.ingredients.add("mozzarella");
        pizza.ingredients.add("mushrooms");
        pizza.ingredients.add("ham");
        pizza.ingredients.add("olives");
        
        return this;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
