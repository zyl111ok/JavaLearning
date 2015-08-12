/**
*请求者，负责调用命令对象执行请求
*/
public class Invoker{
	private Command command=null;

	public Invoker(Command command){
		this.command=command;
	}

	public void action(){
		command.execute();
	}
}