import java.io.*;
import java.util.*;
public class Sender implements Runnable{
	private Random rand=new Random(47);
	private PipedWriter out=new PipedWriter();
	public PipedWriter getPipedWriter(){return out;}
	public void run(){
		try{
			while(true)
				for(char c='A';c<='z';c++){
					out.write(c);
					Thread.sleep(rand.nextInt(500));
				}
		}catch(IOException e){
			System.out.println(e+" Sender write exception");
		}catch(InterruptedException e){
			System.out.println(e+" Sender sleep interrupted");
		}
	} 
}