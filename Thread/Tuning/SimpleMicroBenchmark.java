public class SimpleMicroBenchmark{
	static long test(Incrementable incr){
		long start=System.nanoTime();
		for(long i=0;i<100000000L;i++)
			incr.increment();
		return System.nanoTime()-start;
	}
	public static void main(String args[]){
		long synchTime=test(new SynchronizingTest());
		long lockTime=test(new LockingTest());
		System.out.println("synchronized:  "+synchTime);
		System.out.println("Lock:  "+lockTime);
		System.out.println("Lock/synchronized= "+(double)lockTime/(double)synchTime);
	}
}