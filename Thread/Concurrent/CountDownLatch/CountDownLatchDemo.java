import java.util.concurrent.*;
public class CountDownLatchDemo{
	static final int SIZE=5;
	public static void main(String args[])throws Exception{
		ExecutorService exec=Executors.newCachedThreadPool();
		CountDownLatch latch=new CountDownLatch(SIZE);
		for(int i=0;i<10;i++)
			exec.execute(new WaitingTask(latch));
		for(int i=0;i<10;i++)
			exec.execute(new TaskPortion(latch));
		System.out.println("Launched all tasks");
		exec.shutdown();
	}
}