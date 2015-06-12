public class Interrupting2{
	public static void main(String args[])throws Exception{
		Thread t=new Thread(new Blocked2());
		t.start();
		Thread.sleep(1000);
		System.out.println("Issuing t.interrupt()");
		t.interrupt();
	}
}