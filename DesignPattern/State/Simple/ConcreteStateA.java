public class ConcreteStateA implements State{
	@Override
	public void handle(String sample){
		System.out.println("ConcreteStateA handle:"+sample);
	}
}