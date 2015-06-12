import java.util.concurrent.*;
import java.util.*;
public class WaitingTask implements Runnable{
	private static int counter=0;
	private final int id=counter++;
	private final CountDownLatch latch;
	public WaitingTask(CountDownLatch latch){
		this.latch=latch;
	}
	public void run(){
		try{
			latch.await();
			Thread.sleep(50);
			System.out.println("Latch barrier passed for "+this);
		}catch(InterruptedException e){
			System.out.println(this+" interrupted");
		}
	}

	public String toString(){
		return String.format("WaitingTask %d ",id);
	}
}