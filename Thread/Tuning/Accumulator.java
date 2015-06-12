import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;

abstract class Accumulator{
	public static long cycles=50000L;
	private static final int N=4;
	public static ExecutorService exec=Executors.newFixedThreadPool(N*2);
	private static CyclicBarrier barrier=new CyclicBarrier(N*2+1);
	protected volatile int index=0;
	protected volatile long value=0;
	protected long duration=0;
	protected String id="error";
	protected final static int SIZE=100000;
	protected static int[] preLoaded=new int[SIZE];
	static{
		Random rand=new Random(47);
		for(int i=0;i<SIZE;i++)
			preLoaded[i]=rand.nextInt();
	}
	public abstract void accumulate();
	public abstract long read();
	private class Modifier implements Runnable{
		public void run(){
			for(long i=0;i<cycles;i++)
				accumulate();
			try{
				barrier.await();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	private class Reader implements Runnable{
		private volatile long value;
		public void run(){
			for(long i=0;i<cycles;i++)
				value=read();
			try{
				barrier.await();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	public void timedTest(){
		long start=System.nanoTime();
		for(int i=0;i<N;i++){
			exec.execute(new Modifier());
			exec.execute(new Reader());
		}
		try{
			barrier.await();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		duration=System.nanoTime()-start;
		System.out.println(id+duration);
	}
	public static void report(Accumulator acc1,Accumulator acc2){
		System.out.println(acc1.id+"/"+acc2.id+(double)acc1.duration/(double)acc2.duration);
	}

}