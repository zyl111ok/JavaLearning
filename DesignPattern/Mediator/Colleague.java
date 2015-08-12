/**
*中介者模式房屋中介所模拟,顾客模拟
*/
public abstract class Colleague{
	protected String name;
	protected Mediator mediator;

	Colleague(String name,Mediator mediator){
		this.name=name;
		this.mediator=mediator;
	}
}