package genericCommand;

public abstract class GenericCommand<Receiver> implements Command {

	protected Receiver receiver;
	
	public GenericCommand(Receiver r){
		this.receiver = r;
	}
	
	@Override
	public abstract void execute();
}
