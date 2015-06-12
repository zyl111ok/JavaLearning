import java.util.*;
import java.util.concurrent.*;
public class PrioritizedTaskConsumer implements Runnable{
	private PriorityBlockingQueue<Runnable> q;
	public PrioritizedTaskConsumer(PriorityBlockingQueue<Runnable> q){
		this.q=q;
	}
	public void run(){
		try{
			while(!Thread.interrupted())
				q.take().run();
		}catch(InterruptedException e){

		}
		System.out.println("Finished PrioritizedTaskConsumer");
	}
}