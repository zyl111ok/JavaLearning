import java.util.*;
import java.util.concurrent.*;
public class PriorityBlockingQueueDemo{
	public static void main(String args[])throws Exception{
		Random rand=new Random(47);
		ExecutorService exec=Executors.newCachedThreadPool();
		PriorityBlockingQueue<Runnable> queue=new PriorityBlockingQueue<Runnable>();
		exec.execute(new PrioritizedTaskProducer(queue,exec));
		exec.execute(new PrioritizedTaskConsumer(queue));
	}
}