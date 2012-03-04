public class Banana {
	public void determinePeelingEndToStartFrom() {
		System.out.println("Determing The End To Peel Off From.");
	}

	public void peelOff() {
		System.out.println("Peeling This Banana Off.");
	}
	
	public void peelTheStrokesOff(){
		System.out.println("Peeling This Banana's Strokes Off.");	
	}

	public void eat() {
		determinePeelingEndToStartFrom();
		peelOff();
		peelTheStrokesOff();
		
		System.out.println("Finally Eating The Banana!");
	}
}
