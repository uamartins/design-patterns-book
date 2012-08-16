package game;

import java.util.*;

public class CompositeCommand implements Command {
	private boolean isLocked;
	private List<Command> commands = new ArrayList<Command>();
	
	@Override
	public void execute() {
		this.isLocked = true;
		for (int i = 0; i < this.commands.size(); i++){
			this.commands.get(i).execute();
		}
	}

	@Override
	public void undo() {
		for (int i = this.commands.size() - 1; i >= 0; i--){
			this.commands.get(i).undo();
		}	
	}
	
	public void addCommand(Command command){
		if(!this.isLocked){
			this.commands.add(command);
		}
		else{
	//handle error
		}
	}
}
