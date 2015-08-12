public class EmailImplementor implements MessageImplementor{
	@Override 
	public void send(String message,String toUser){
		System.out.println("Email: "+message+"¸ø "+toUser);
	}
}