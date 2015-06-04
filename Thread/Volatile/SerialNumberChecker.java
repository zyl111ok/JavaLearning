import java.util.concurrent.*;
public class SerialNumberChecker{
	private static final int SIZE=10;
	private static CircularSet serials=new CircularSet(1000);
	private static ExecutorService exec=Executors.newCachedThreadPool();
	static class SerialChecker implements Runnable{
		public void run(){
			while(true){
				int serial=SerialNumberGenerator.nextSerialNumber();
				if(serials.contains(serial)){
					System.out.println("Duplicate: "+serial);
					System.exit(0);
				}
				serials.add(serial);
			}
		}
	}
	public static void main(String args[])throws Exception{
		for(int i=0;i<SIZE;i++)
			exec.execute(new SerialChecker());
		if(args.length>0){
			Thread.sleep((new Integer(args[0]))*1000);
			System.out.println("No duplicates detected");
			System.exit(0);
		}
	}
}