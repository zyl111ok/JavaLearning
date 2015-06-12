import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.util.*;
public class SynchronizationComparisions{
	static BaseLine baseLine=new BaseLine();
	static SynchronizedTest synch=new SynchronizedTest();
	static LockTest lock=new LockTest();
	static AtomicTest atomic=new AtomicTest();
	static void test(){
		System.out.println("========================");
		System.out.println("Cycles  "+Accumulator.cycles);
		baseLine.timedTest();
		synch.timedTest();
		lock.timedTest();
		atomic.timedTest();
		Accumulator.report(synch,baseLine);
		Accumulator.report(lock,baseLine);
		Accumulator.report(atomic,baseLine);
		Accumulator.report(synch,lock);
		Accumulator.report(synch,atomic);
		Accumulator.report(lock,atomic);
	}
	public static void main(String args[]){
		int iterations=5;
		if(args.length>0)
			iterations=new Integer(args[0]);
		System.out.println("Warmup");
		baseLine.timedTest();
		for(int i=0;i<iterations;i++){
			test();
			Accumulator.cycles*=2;
		}
		Accumulator.exec.shutdown();
	}
}