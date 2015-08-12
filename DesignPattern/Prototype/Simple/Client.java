public class Client{
	private Prototype prototype;
	public Client(Prototype prototype){
		this.prototype=prototype;
	}
	public void operation(Prototype example){
		Prototype copyPrototype=(Prototype)example.clone();
		copyPrototype.sayHello();
	}
	public static void main(String args[]){
		Prototype prototype=new ConcreatePrototype();
		Prototype prototype1=new ConcreatePrototype1();
		Client client=new Client(prototype);
		client.operation(prototype);
		client.operation(prototype1);
	}
}