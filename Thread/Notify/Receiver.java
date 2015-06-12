import java.io.*;
import java.util.*;
public class Receiver implements Runnable{
	private PipedReader in;
	public Receiver(Sender sender)throws IOException{
		in=new PipedReader(sender.getPipedWriter());
	}
	public void run(){
		try{
			while(true){
				System.out.print("Read: "+(char)in.read()+", ");
			}
		}catch(IOException e){
			System.out.println(e+" Receiver read exception");
		}
	}
}