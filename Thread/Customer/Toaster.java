import java.util.*;
public class Toaster implements Runnable{
	private ToastQueue toastQueue;
	private int count=0;
	private Random rand=new Random(47);
	public Toaster(ToastQueue tq){toastQueue=tq;}
	public void run(){
		try{
			while(!Thread.interrupted()){
				Thread.sleep(100+rand.nextInt(500));
				Toast t=new Toast(count++);
				System.out.println(t);
				toastQueue.put(t);
			}
		}catch(InterruptedException e){
			System.out.println("Toaster interrupted");
		}
		System.out.println("Toaster Off");
	}
}