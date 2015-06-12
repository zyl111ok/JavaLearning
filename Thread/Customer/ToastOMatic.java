import java.util.concurrent.*;
public class ToastOMatic{
	public static void main(String args[] )throws Exception{
		ToastQueue dryQueue=new ToastQueue(),
				   butteredQueue=new ToastQueue(),
				   finishedQueue=new ToastQueue();
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new Toaster(dryQueue));
		exec.execute(new Butterer(dryQueue,butteredQueue));
		exec.execute(new Jammer(butteredQueue,finishedQueue));
		exec.execute(new Eater(finishedQueue));
		Thread.sleep(5000);
		exec.shutdownNow();
	}
}