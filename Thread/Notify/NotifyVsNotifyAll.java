import java.util.*;
import java.util.concurrent.*;
public class NotifyVsNotifyAll{
	public static void main(String args[])throws Exception{
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new Task());
		exec.execute(new Task2());
		Timer timer=new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			boolean prod=true;
			public void run(){
				if(prod){
					System.out.print("\n notify() ");
					Task.blocker.prod();
					prod=false;
				}else{
					System.out.print("\n notifyAll");
					Task.blocker.prodAll();
					prod=true;
				}
			}
		},400,400);
		Thread.sleep(5000);
		timer.cancel();
		System.out.println("\n Timer canceled");
		Thread.sleep(500);
		System.out.println("Task2.blocker.prodAll()");
		Task2.blocker.prodAll();
		Thread.sleep(500);
		System.out.println("\n Shutting down");
		exec.shutdownNow();
	}
}