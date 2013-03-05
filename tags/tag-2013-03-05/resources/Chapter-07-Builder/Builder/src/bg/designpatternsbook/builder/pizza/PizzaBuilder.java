package bg.designpatternsbook.builder.pizza;

public interface PizzaBuilder {
    
    public PizzaBuilder buildDough();
    
    public PizzaBuilder buildSauce();
    
    public PizzaBuilder buildTopping();
    
    public Pizza getPizza();
}
