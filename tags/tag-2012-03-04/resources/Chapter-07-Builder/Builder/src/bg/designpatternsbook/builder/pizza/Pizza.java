package bg.designpatternsbook.builder.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public List<String> ingredients = new ArrayList<String>();
    
    @Override 
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        for (String ingredient: ingredients) {
            builder.append(ingredient);
            builder.append(" ");
        }
        
        return builder.toString();
    }
}
