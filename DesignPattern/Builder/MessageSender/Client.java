public class Client{
	public static void  main(String args[])throws Exception{
		Builder builder=new WelcomeBuilder();
		Director director=new Director(builder);
		director.construct("toAddress@126.com","fromAddress@126.com");
		Thread.sleep(5000);
		Builder builder1=new GoodbyeBuilder();
		Director director1=new Director(builder1);
		director1.construct("formAddress@126.com","toAddress@126.com");
	}
}