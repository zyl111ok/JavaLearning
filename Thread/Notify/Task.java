public class Task implements Runnable{
	public static Blocker blocker=new Blocker();
	public void run(){blocker.waitingCall();}
}