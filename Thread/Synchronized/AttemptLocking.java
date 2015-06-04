import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class AttemptLocking{
	private ReentrantLock lock=new ReentrantLock();
	public void untimed(){
		boolean captured=lock.tryLock();
		try{
			System.out.println("tryLock(): "+captured);
		}
		finally{
			if(captured)
				lock.unlock();
		}
	}
	public void timed(){
		boolean captured=false;
		try{
			captured=lock.tryLock(1,TimeUnit.SECONDS);
		}catch(InterruptedException e){
			throw new RuntimeException(e);
		}
		try{
			System.out.println("tryLock(5,TimeUnit.SECONDS):"+captured);
		}
		finally{
			if(captured)
				lock.unlock();
		}
	}
	public static void main(String args[])throws Exception{
		final AttemptLocking al=new AttemptLocking();
		al.untimed();
		al.timed();
		new Thread(){
			{
				setDaemon(true);
			}
			public void run(){
				al.lock.lock();
				System.out.println("acquired");
			}
		}.start();
		Thread.sleep(100);
		al.untimed();
		al.timed();
	}
}