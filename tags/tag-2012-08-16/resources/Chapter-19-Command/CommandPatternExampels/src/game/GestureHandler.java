package game;

import java.util.*;

public class GestureHandler {
	private CommandManager commandManager;
	private Gestures undoKey, redoKey;
	private Map<Gestures, Command> commandBindings = new HashMap<Gestures, Command>();
	
	public GestureHandler(CommandManager manager){
		this.commandManager = manager;
	}
	
	public void registerCommand(Gestures gesture, Command command){
		this.commandBindings.put(gesture, command);
	}
	
	public void registerUndoKey(Gestures gesture){
		this.undoKey = gesture;
	}
	
	public void registerRedoKey(Gestures gesture){
		this.redoKey = gesture;
	}
	
	public void handleGesture(Gestures gesture){
		if(gesture == this.undoKey){
			this.commandManager.undoCommand();
		}
		else if(gesture == this.redoKey){
			this.commandManager.redoCommand();
		}
		else{		
			Command command = this.commandBindings.get(gesture);
			if(command != null){
				this.commandManager.executeCommand(command);
			}
		}
	}
	
	//Gesture recognition logic
}
