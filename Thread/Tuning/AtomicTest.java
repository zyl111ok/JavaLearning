import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;
public class AtomicTest extends Accumulator{
	{id="Atomic";}
	private AtomicInteger index=new AtomicInteger(0);
	private AtomicLong value=new AtomicLong(0);
	public void accumulate(){
		int i=index.getAndIncrement();
		value.getAndAdd(preLoaded[i]);
		if(++i>=SIZE)
			index.set(0);
	}
	public long read(){return value.get();}
}