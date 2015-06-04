public class Daemons{
	public static void main(String args[])throws Exception{
		Thread d=new Thread(new Daemon());
		d.setDaemon(true);
		d.start();
		System.out.print("d.isDaemon()="+d.isDaemon()+", ");
		Thread.sleep(1000);
	}
}