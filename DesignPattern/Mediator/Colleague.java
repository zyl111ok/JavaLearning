/**
*�н���ģʽ�����н���ģ��,�˿�ģ��
*/
public abstract class Colleague{
	protected String name;
	protected Mediator mediator;

	Colleague(String name,Mediator mediator){
		this.name=name;
		this.mediator=mediator;
	}
}