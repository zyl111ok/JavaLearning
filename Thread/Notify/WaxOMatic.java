import java.util.concurrent.*;
public class WaxOMatic{
	public static void main(String args[])throws Exception{
		Car car=new Car();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new WaxOff(car));
		exec.execute(new WaxOn(car));
		Thread.sleep(5000);
		exec.shutdownNow();
	}
}