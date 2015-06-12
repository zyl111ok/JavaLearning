import java.util.*;
import java.util.concurrent.*;
public class TaskPortion implements Runnable{
	private static int counter=0;
	private final int id=counter++;
	private static Random rand=new Random(47);
	private final CountDownLatch latch;
	public TaskPortion(CountDownLatch latch){
		this.latch=latch;
	}
	public void run(){
		try{
			doWork();
			latch.countDown();
		}catch(InterruptedException e){

		}
	}
	public void doWork() throws InterruptedException{
		Thread.sleep(rand.nextInt(2000));
		System.out.println(this+"completed");
	}
	public String toString(){
		return String.format("%1$-3d ",id);
	}
}