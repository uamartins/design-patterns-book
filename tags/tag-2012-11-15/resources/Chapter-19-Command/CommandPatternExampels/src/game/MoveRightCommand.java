package game;

public class MoveRightCommand implements Command {

	private Robot robot;
	
	public MoveRightCommand(Robot r){
		this.robot = r;
	}
	@Override
	public void execute() {
		this.robot.moveRight();
	}

	@Override
	public void undo() {
		this.robot.moveLeft();
		
	}

}
