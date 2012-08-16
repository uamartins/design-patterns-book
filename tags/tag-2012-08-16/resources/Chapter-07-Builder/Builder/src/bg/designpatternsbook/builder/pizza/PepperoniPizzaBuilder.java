package bg.designpatternsbook.builder.pizza;

public class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza = new Pizza();

    @Override
    public PizzaBuilder buildDough() {
        pizza.ingredients.add("easy pizza dough");
        
        return this;
    }

    @Override
    public PizzaBuilder buildSauce() {
        pizza.ingredients.add("piquant tomato sauce");
        
        return this;
    }

    @Override
    public PizzaBuilder buildTopping() {
        pizza.ingredients.add("mozzarella");
        pizza.ingredients.add("pepperoni");

        return this;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
