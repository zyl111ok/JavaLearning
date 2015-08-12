public class Client{
	public static void main(String args[]){
		Context con=new Context(new Method1());
		con.operate();
		con=new Context(new Method2());
		con.operate();
		con=new Context(new Method3());
		con.operate();
	}
}