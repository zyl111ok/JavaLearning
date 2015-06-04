import java.util.concurrent.*;
public class Interrupting{
	private static ExecutorService exec=Executors.newCachedThreadPool();
	static void test(Runnable r)throws InterruptedException{
		Future<?> f=exec.submit(r);
		Thread.sleep(100);
		System.out.println("Interrupting "+r.getClass().getName());
		f.cancel(true);
		System.out.println("Interrupt sent to "+r.getClass().getName());
	}
	public static void main(String args[])throws Exception{
		test(new SleepBlocked());
		test(new IOBlocked(System.in));
		test(new SynchronizedBlocked());
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Aborting with System.exit(0)");
		System.exit(0);
	}
}