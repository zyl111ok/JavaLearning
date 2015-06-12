import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;
public class LockTest extends Accumulator{
	{id="lock";}
	private Lock lock=new ReentrantLock();
	public void accumulate(){
		lock.lock();
		try{
			value+=preLoaded[index++];
			if(index>=SIZE)index=0;
		}
		finally{
			lock.unlock();
		}
	}
	public long read(){
		lock.lock();
		try{
			return value;
		}finally{
			lock.unlock();
		}
	}
}
