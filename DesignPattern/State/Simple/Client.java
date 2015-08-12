public class Client{
	public static void main(String args[]){
		State state=new ConcreteStateB();
		Context context=new Context();
		context.setState(state);
		context.request("test");
		state=new ConcreteStateA();
		context.setState(state);
		context.request("test");
	}
}