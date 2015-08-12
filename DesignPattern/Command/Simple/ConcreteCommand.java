/**
*¾ßÌåÃüÁî½ÇÉ«
*/
public class ConcreteCommand implements Command{
	private Receiver receiver=null;

	public ConcreteCommand(Receiver receiver){
		this.receiver=receiver;
	}
	@Override
	public void execute(){
		receiver.action();
	}
}