public class WelcomeBuilder extends Builder{
	public WelcomeBuilder(){
		msg=new WelcomeMessage();
	}
	@Override
	public void buildBody(){
		msg.setBody("��ӭ����");
	}
	@Override
	public void buildSubject(){
		msg.setSubject("��ӭ����");
	}
}