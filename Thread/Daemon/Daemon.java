import java.util.concurrent.*;
public class Daemon implements Runnable{
	private Thread[] t=new Thread[10];
	public void run(){
		for(int i=0;i<t.length;i++){
			t[i]=new Thread(new DaemonSpawn());
			t[i].start();
			System.out.print("DaemonSpawn "+i+"started, ");
		}
		for(int i=0;i<t.length;i++)
			System.out.print("t["+i+"].isDaemon()= "+t[i].isDaemon()+", ");
		while(true)
			Thread.yield();
	}
}