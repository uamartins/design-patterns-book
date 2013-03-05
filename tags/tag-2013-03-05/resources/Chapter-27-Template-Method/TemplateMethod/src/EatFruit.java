/**
 * 
 */

/**
 * @author I056723
 *
 */
public class EatFruit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Apple apple = new Apple();
		Banana banana = new Banana();
		
        apple.washAppleOut();
        apple.peelOffApple();
        apple.chopApple();
        apple.eatApple();
        
        banana.determinePeelingEndToStartFrom();
        banana.peelOffBanana();
        banana.eatBanana();
	}

}
