import java.util.LinkedList;
import java.util.List;

public abstract class Fruit {

	private static List<Fruit> availableFruit = new LinkedList<Fruit>();
	protected int m_weight;

	public int getWeight() {
		return m_weight;
	}

	public void setWeight(int m_weight) {
		this.m_weight = m_weight;
	}

	public abstract void prepareToPeel();

	public void peelOff() {
		System.out.println("Peeling This Fruit Off.");
	}

	public abstract void processAfterPeel();

	public void eat() {
		System.out.println("Eating This Fruit.");
	}

	public final void consume() {
		prepareToPeel();
		peelOff();
		processAfterPeel();
		eat();

		System.out.println("Finally Eating The Apple!");
	}

	private static final Fruit binarySearch(Fruit concrete, int start, int end) {
		int mid;

		while (start <= end) {
			mid = (start + end) / 2;
            int result = availableFruit.get(mid).compareTo(concrete);
            if(result == 1){
            	return availableFruit.get(mid);
            } else if ( result < 0) {
				binarySearch(concrete, mid + 1, end);
			} else if (result > 1) {
				binarySearch(concrete, start, mid - 1);
			}				
		}
		return null; // NOT_FOUND
	}

	public static final Fruit binarysearch(Fruit concreteFruit) {
		return Fruit.binarySearch(concreteFruit, 0,
				Fruit.availableFruit.size() - 1);
	}

	public static List<Fruit> getAvailableFruit() {
		return availableFruit;
	}

	public static void addFruit(Fruit newFruit) {
		availableFruit.add(newFruit);
	}

	public abstract int compareTo(Fruit otherfruit);

}