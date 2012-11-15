package game;

public class MoveLeftCommand implements Command {

	private Robot robot;
	
	public MoveLeftCommand(Robot r){
		this.robot = r;
	}

	public void execute() {
		this.robot.moveLeft();
	}

	@Override
	public void undo() {
		this.robot.moveRight();	
	}

}
