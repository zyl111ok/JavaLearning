import java.util.concurrent.locks.*;
public class ExplicitPairManager2 extends PairManager{
	private Lock lock=new ReentrantLock();
	public void increment(){
		Pair temp;
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			temp=getPair();
		}
		finally{
			lock.unlock();
		}
		store(temp);
	}
}  