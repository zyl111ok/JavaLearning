/**
*租房者模拟
*/
public class ConcreteColleagueB extends Colleague{
	ConcreteColleagueB(String name,Mediator mediator){
		super(name,mediator);
	}
	/**
	*与中介者联系
	*/
	public void contact(String message){
		mediator.contact(message,this);
	}
	/**
	*获得信息
	*/
	public void getMessage(String message){
		System.out.println("租房者: "+name+" 获得信息 "+message);
	}
}