import java.io.*;
public class IOBlocked implements Runnable{
	private InputStream in;
	public IOBlocked(InputStream is){in=is;}
	public void run(){
		try{
			System.out.println("Waiting for read(): ");
			in.read();
		}
		catch(IOException e){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Interrupted from blocked I/O");
			}
			else{
				throw new RuntimeException(e);
			}
		}
		System.out.println("Exiting IOBlocked.run()");
	}
}