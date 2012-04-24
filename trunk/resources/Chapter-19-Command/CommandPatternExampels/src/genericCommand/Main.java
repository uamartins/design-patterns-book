package genericCommand;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot r = new Robot();
		
		Command movecommand = new GenericCommand<Robot>(r){
			@Override
			public void execute() {
				this.receiver.moveLeft();
			}
		};

		movecommand.execute();
	}

}
