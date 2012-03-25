package bg.designpatternsbook.builder.pizza;

public class PizzaShop {
    
    public void constructPizza(PizzaBuilder builder) {
        builder.buildDough().buildSauce().buildTopping();
    }
}