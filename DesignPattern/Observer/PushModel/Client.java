public class Client {
	public static void main(String args[]){
		ConcreteSubject subject=new ConcreteSubject();
		Observer observer=new ConcreteObserver();
		Observer observer1=new ConcreteObserver();
		subject.attach(observer);
		subject.attach(observer1);
		subject.change("new state");
	}
}