public class ConcreteObserver implements Observer{
	private String observerState=null;
	@Override
	public void update(Subject subject){
		observerState=((ConcreteSubject)subject).getState();
		System.out.println("�۲���״̬Ϊ: "+observerState);
	}
}