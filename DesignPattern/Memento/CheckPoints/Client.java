public class Client{
	public static void main(String args[]){
		Originator o=new Originator();
		Caretaker c=new Caretaker(o);
		//�ı�״̬
		o.setState("state 0");
		//����һ������
		c.createMemento();
		//�ı�״̬
		o.setState("state 1");
		c.createMemento();

		o.setState("state 2");
		c.createMemento();

		o.setState("state 3");
		c.createMemento();

		o.printStates();
		System.out.println("---------------�ָ�����-------------");

		c.restoreMemento(2);
		o.printStates();
	} 
}