public class ConcreteObserver implements Observer{
	private String observerState=null;
	@Override
	public void update(String state){
		observerState=state;
		System.out.println("¹Û²ìÕß×´Ì¬Îª: "+observerState);
	}
}