/**
*����ģ��
*/
public class ConcreteColleagueA extends Colleague{
	ConcreteColleagueA(String name,Mediator mediator){
		super(name,mediator);
	}
	/**
	*���н�����ϵ
	*/
	public void contact(String message){
		mediator.contact(message,this);
	}
	/**
	*�����Ϣ
	*/
	public void getMessage(String message){
		System.out.println("����: "+name+" �����Ϣ "+message);
	}
}