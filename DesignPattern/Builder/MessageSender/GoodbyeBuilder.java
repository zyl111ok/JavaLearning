public class GoodbyeBuilder extends Builder{
	public GoodbyeBuilder(){
		msg=new GoodbyeMessage();
	}
	@Override
	public void buildBody(){
		msg.setBody("�ټ�����");
	}
	@Override
	public void buildSubject(){
		msg.setSubject("�ټ�����");
	}
}