package game;
import java.awt.Point;

public class MoveToPositionCommand implements Command {
	
	private Robot robot;
	private Point positionAfter, positionBefore;
	
	public MoveToPositionCommand(Point position, Robot r){
		this.robot = r;
		this.positionAfter = position;
	}

	public void execute() {
		//save state before executing
		this.positionBefore = this.robot.getPosition();
		this.robot.moveToPosition(this.positionAfter);
	}

	@Override
	public void undo() {
		this.robot.moveToPosition(this.positionBefore);
	}

}
