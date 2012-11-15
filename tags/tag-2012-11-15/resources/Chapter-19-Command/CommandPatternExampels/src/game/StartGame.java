package game;

public class StartGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Robot robot = new Robot();
		GestureHandler gestureHandler = new GestureHandler(new CommandManager());
		
		gestureHandler.registerUndoKey(Gestures.WAVE_LEFT);
		gestureHandler.registerRedoKey(Gestures.WAVE_RIGHT);
		gestureHandler.registerCommand(Gestures.POINT_LEFT, new MoveLeftCommand(robot));
		gestureHandler.registerCommand(Gestures.POINT_RIGHT, new MoveRightCommand(robot));
		gestureHandler.registerCommand(Gestures.POINT_UP, new MoveUpCommand(robot));
		gestureHandler.registerCommand(Gestures.POINT_DOWN, new MoveDownCommand(robot));
		
		//creating composite command example
		CompositeCommand zigZagCommand = new CompositeCommand();
		zigZagCommand.addCommand(new MoveRightCommand(robot));
		zigZagCommand.addCommand(new MoveUpCommand(robot));
		zigZagCommand.addCommand(new MoveLeftCommand(robot));
		zigZagCommand.addCommand(new MoveUpCommand(robot));	
		gestureHandler.registerCommand(Gestures.SHAKE, zigZagCommand);

		//creating Generic command example
		Command crouchCommand = new GenericCommand<Robot>(robot){
			public void execute() { this.receiver.crouch(); }
			public void undo() { this.receiver.standUp();	}
		};		
		gestureHandler.registerCommand(Gestures.CROUCH, crouchCommand);
			
		
		//Test
		gestureHandler.handleGesture(Gestures.POINT_LEFT);
		gestureHandler.handleGesture(Gestures.POINT_LEFT);
		gestureHandler.handleGesture(Gestures.POINT_LEFT);
		gestureHandler.handleGesture(Gestures.POINT_LEFT);
		
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.WAVE_RIGHT);
		gestureHandler.handleGesture(Gestures.WAVE_RIGHT);
		
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.POINT_RIGHT);
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.WAVE_LEFT);
		gestureHandler.handleGesture(Gestures.POINT_RIGHT);

		gestureHandler.handleGesture(Gestures.SHAKE);
		
	}

}
