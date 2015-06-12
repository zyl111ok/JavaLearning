import java.net.*;
import java.io.*;
import java.util.concurrent.*;
public class CloseResource{
	public static void main(String args[])throws Exception{
		ExecutorService exec=Executors.newCachedThreadPool();
		ServerSocket server=new ServerSocket(8000);
		InputStream socketInput=new Socket("localhost",8000).getInputStream();
		exec.execute(new IOBlocked(socketInput));
		exec.execute(new IOBlocked(System.in));
		Thread.sleep(100);
		System.out.println("Shutting down all thereads");
		exec.shutdownNow();
		Thread.sleep(1000);
		System.out.println("Closing "+socketInput.getClass().getName());
		socketInput.close();
		Thread.sleep(1000);
		System.out.println("Closing "+System.in.getClass().getName());
		System.in.close();
	}
}