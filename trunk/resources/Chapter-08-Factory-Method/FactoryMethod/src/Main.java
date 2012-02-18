import java.io.Console;
import java.util.Dictionary;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ShapesModuleFactory f = new ShapesModuleFactory();
		Module module = f.createModule();
		System.out.println(module.getClass().toString());
	}	
}
