import java.util.*;
import java.util.concurrent.*;

public class Horse implements Runnable{
	private static int counter=0;
	private final int id=counter++;
	private int strides=0;
	private static Random rand=new Random(47);
	private static CyclicBarrier barrier;
	public Horse(CyclicBarrier b){barrier=b;}
	public synchronized int getStrides(){return strides;}
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					strides+=rand.nextInt(3);
				}
				barrier.await();
			}
		}catch(InterruptedException e){

		}catch(BrokenBarrierException e){
			throw new RuntimeException(e);
		}
	}
	public String toString(){return "Horse "+id+" ";}
	public String tracks(){
		StringBuilder s=new StringBuilder();
		for(int i=0;i<getStrides();i++)
			s.append("*");
		s.append(id);
		return s.toString();
	}
}
