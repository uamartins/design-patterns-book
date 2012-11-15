package game;

public class MoveDownCommand implements Command {

	private Robot robot;
	
	public MoveDownCommand(Robot r){
		this.robot = r;
	}
	@Override
	public void execute() {
		this.robot.moveDown();
	}

	@Override
	public void undo() {
		this.robot.moveUp();	
	}

}
