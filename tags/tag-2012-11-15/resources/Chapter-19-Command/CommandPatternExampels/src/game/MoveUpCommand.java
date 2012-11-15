package game;

public class MoveUpCommand implements Command {

	private Robot robot;
	
	public MoveUpCommand(Robot r){
		this.robot = r;
	}
	@Override
	public void execute() {
		this.robot.moveUp();
	}

	@Override
	public void undo() {
		this.robot.moveDown();	
	}

}
