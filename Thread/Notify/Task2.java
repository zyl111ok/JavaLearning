public class Task2 implements Runnable{
	public static Blocker blocker=new Blocker();
	public void run(){blocker.waitingCall();}
}