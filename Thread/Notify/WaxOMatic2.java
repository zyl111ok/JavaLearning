import java.util.concurrent.*;
public class WaxOMatic2{
	public static void main(String args[])throws Exception{
		Car1 car=new Car1();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new WaxOff1(car));
		exec.execute(new WaxOn1(car));
		Thread.sleep(5000);
		exec.shutdownNow();
	}
}