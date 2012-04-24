package genericCommand;

import java.awt.Point;

public class Robot {
	private Point position = new Point();

	public void moveLeft(){
		this.position.x -= 1;
		this.printPosition();
	}
	
	public void moveRight(){
		this.position.x += 1;
		this.printPosition();
	}
	
	public void moveUp(){
		this.position.y -= 1;
		this.printPosition();
	}
	
	public void moveDown(){
		this.position.y += 1;
		this.printPosition();
	}
	
	private void printPosition() {
		System.out.println(String.format("Robot[%2d, %2d]", this.position.x, this.position.y));
	}

	public void moveToPosition(Point position) {
		this.position.move(position.x, position.y);		
	}

	public Point getPosition() {
		return new Point(this.position.x, this.position.y);
	}	
}
