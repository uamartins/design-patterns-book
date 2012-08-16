package game;

import java.util.*;

public class CommandManager {
	private List<Command> history = new ArrayList<Command>();
	private int index = 0;
	
	public void executeCommand(Command command){
		command.execute();
		this.history.add(this.index, command);		
		this.index++;
		
		//clear all the commands in the list after the current
		if(this.history.size() > this.index){
			this.history.subList(this.index, this.history.size()).clear();
		}
	}
	
	public void undoCommand(){
		if(this.index > 0){
			this.index--;
			Command command = this.history.get(this.index);
			command.undo();
		}
	}
	
	public void redoCommand(){
		if(this.history.size() > this.index){
			Command command = this.history.get(this.index);
			command.execute();
			this.index ++;
		}
	}
}
