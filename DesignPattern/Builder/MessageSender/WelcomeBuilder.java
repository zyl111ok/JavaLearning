public class WelcomeBuilder extends Builder{
	public WelcomeBuilder(){
		msg=new WelcomeMessage();
	}
	@Override
	public void buildBody(){
		msg.setBody("»¶Ó­ÄÚÈİ");
	}
	@Override
	public void buildSubject(){
		msg.setSubject("»¶Ó­±êÌâ");
	}
}