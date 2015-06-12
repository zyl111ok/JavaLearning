import java.util.concurrent.*;
import java.util.*;
public class ReaderWriterListTest{
	ExecutorService exec=Executors.newCachedThreadPool();
	private final static int SIZE=100;
	private static Random rand=new Random(47);
	private ReaderWriterList<Integer> list=new ReaderWriterList<Integer>(SIZE,0);
	private class Writer implements Runnable{
		public void run(){
			try{
				for(int i=0;i<20;i++){
					list.set(i,rand.nextInt());
					Thread.sleep(100);
				}
			}catch(InterruptedException e){

			}
			System.out.println("Writer finished ,shutting down");
			exec.shutdownNow();
		}
	}
	private class Reader implements Runnable{
		public void run(){
			try{
				while(!Thread.interrupted()){
					for(int i=0;i<SIZE;i++){
						list.get(i);
						Thread.sleep(1);
					}
				}
			}catch(InterruptedException e){

			}
		}
	}
	public ReaderWriterListTest(int readers,int writers){
		for(int i=0;i<readers;i++)
			exec.execute(new Reader());
		for(int i=0;i<writers;i++)
			exec.execute(new Writer());
	}
}