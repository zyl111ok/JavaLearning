public class Client{
	public static void main(String args[]){
		Originator o=new Originator();
		Caretaker c=new Caretaker(o);
		//改变状态
		o.setState("state 0");
		//建立一个检查点
		c.createMemento();
		//改变状态
		o.setState("state 1");
		c.createMemento();

		o.setState("state 2");
		c.createMemento();

		o.setState("state 3");
		c.createMemento();

		o.printStates();
		System.out.println("---------------恢复检查点-------------");

		c.restoreMemento(2);
		o.printStates();
	} 
}