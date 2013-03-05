/**
 * 
 */

/**
 * @author I056723
 *
 */
public class SearchFruit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Apple apple1 = new Apple(4);
		Apple apple2 = new Apple(4);
		Apple apple3 = new Apple(4);
		Apple apple4 = new Apple(4);
		Apple apple5 = new Apple(4);
		Apple apple6 = new Apple(4);
		Apple apple7 = new Apple(4);
		Apple apple8 = new Apple(4);
		Apple apple9 = new Apple(4);
		Apple apple10 = new Apple(4);
		
		Fruit.addFruit(apple1);
		Fruit.addFruit(apple2);
		Fruit.addFruit(apple3);
		Fruit.addFruit(apple4);
		Fruit.addFruit(apple5);
		Fruit.addFruit(apple6);
		Fruit.addFruit(apple7);
		Fruit.addFruit(apple8);
		Fruit.addFruit(apple9);
		Fruit.addFruit(apple10);
		
		Banana banana1 = new Banana(1, 2);
		Banana banana2 = new Banana(2, 3);
		Banana banana3 = new Banana(3, 4);
		Banana banana4 = new Banana(4, 5);
		Banana banana5 = new Banana(5, 6);
		Banana banana6 = new Banana(6, 7);
		Banana banana7 = new Banana(7, 8);
		Banana banana8 = new Banana(8, 9);
		Banana banana9 = new Banana(9, 10);
		Banana banana10 = new Banana(10, 11);
		
		Fruit.addFruit(banana1);
		Fruit.addFruit(banana2);
		Fruit.addFruit(banana3);
		Fruit.addFruit(banana4);
		Fruit.addFruit(banana5);
		Fruit.addFruit(banana6);
		Fruit.addFruit(banana7);
		Fruit.addFruit(banana8);
		Fruit.addFruit(banana9);
		Fruit.addFruit(banana10);
		
		Banana searchedForbanana = new Banana(6, 7);
		Fruit result = Fruit.binarysearch(searchedForbanana);
        if(result != null){
        	System.out.println("Fruit Found");
        }
        
	}

}
