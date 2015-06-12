import java.util.concurrent.*;
public class Blocked3 implements Runnable{
	private volatile double d=0.0;
	public void run(){
		try{
			while(!Thread.interrupted()){
				NeedsCleanup n1=new NeedsCleanup(1);
				try{
					System.out.println("Sleeping");
					Thread.sleep(1000);
					NeedsCleanup n2=new NeedsCleanup(2);
					try{
						System.out.println("Calculating");
						for(int i=1;i<2500000;i++)
							d=d+(Math.PI+Math.E)/d;
						System.out.println("Finished time-consuming operation");
					}
					finally{
						n2.cleanup();
					}
				}
				finally{
					n1.cleanup();
				}
			}
			System.out.println("Exiting via while() test");
		}
		catch(InterruptedException e){
			System.out.println("Exiting via InterruptedException");
		}
	}
}