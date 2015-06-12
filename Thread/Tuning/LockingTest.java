import java.util.concurrent.locks.*;
public class LockingTest extends Incrementable{
	private Lock lock=new ReentrantLock();
	public void increment(){
		lock.lock();
		try{
			++counter;
		}finally{
			lock.unlock();
		}
	}
}