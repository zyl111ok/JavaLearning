public class Joining{
	public static void main(String args[]){
		Sleeper sleepy=new Sleeper("Sleepy",1500),
				grumpy=new Sleeper("Grumpy",1500);
		Joiner dopey=new Joiner("Dopey",sleepy),
			   doc=new Joiner("Doc",grumpy);
		grumpy.interrupt();

	}
}