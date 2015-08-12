public class ConcreteStateB implements State{
	@Override
	public void handle(String sample){
		System.out.println("ConcreteStateB handle:"+sample);
	}
}