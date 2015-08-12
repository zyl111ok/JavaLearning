public class SMSImplementor implements MessageImplementor{
	@Override 
	public void send(String message,String toUser){
		System.out.println("SMS: "+message+"¸ø "+toUser);
	}
}