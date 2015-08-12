public class ConcreteObserver implements Observer{
	private String observerState=null;
	@Override
	public void update(Subject subject){
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("¹Û²ìÕß×´Ì¬Îª: "+observerState);
	}
}