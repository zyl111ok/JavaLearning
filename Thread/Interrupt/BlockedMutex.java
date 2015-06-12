import java.util.concurrent.*;
import java.util.concurrent.locks.*;
public class BlockedMutex{
	private Lock lock=new ReentrantLock();
	public BlockedMutex(){
		lock.lock();
	}
	public void f(){
		try{
			lock.lockInterruptibly();
			System.out.println("lock acquired in f()");
		}catch(InterruptedException e){
			System.out.println("Interrupted from lock acquisition in f()");
		}
	}
}