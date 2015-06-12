import java.io.*;
import java.util.*;
import java.util.concurrent.*;
public class PipedIO{
	public static void main(String args[])throws Exception{
		Sender sender=new Sender();
		Receiver receiver=new Receiver(sender);
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(sender);
		exec.execute(receiver);
		Thread.sleep(4000);
		exec.shutdownNow();

	}
}