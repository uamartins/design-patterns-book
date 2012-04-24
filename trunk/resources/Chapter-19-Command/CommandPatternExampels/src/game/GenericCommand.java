package game;

public abstract class GenericCommand<Receiver> implements Command {
	protected Receiver receiver;
	
	public GenericCommand(Receiver r){
		this.receiver = r;
	}
}
