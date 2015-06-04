public class BasicThread{
	public static void main(String args[])throws InterruptedException{
		Thread r=new Thread(new LiftOff());
		r.start();
		Thread.sleep(1000);
		System.out.println("Waiting for LiftOff");
	}
}