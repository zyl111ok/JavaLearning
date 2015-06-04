public class DaemonSpawn implements Runnable{
	public void run(){
		while(true)
			Thread.yield();
	}
}