import java.util.concurrent.locks.*;

public class ExplicitPairManager1 extends PairManager{
	private Lock lock=new ReentrantLock();
	public synchronized void increment(){
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			store(getPair());
		}
		finally{
			lock.unlock();
		}
	}
}