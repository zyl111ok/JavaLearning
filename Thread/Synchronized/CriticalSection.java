import java.util.concurrent.*;
public class CriticalSection{
	static void testApproaches(PairManager pman1,PairManager pman2){
		ExecutorService exec=Executors.newCachedThreadPool();
		PairManipulator pm1=new PairManipulator(pman1),
		pm2=new PairManipulator(pman2);
		PairChecker pc1=new PairChecker(pman1),
		pc2=new PairChecker(pman2);
		exec.execute(pm1);
		exec.execute(pm2);
		exec.execute(pc1);
		exec.execute(pc2);

		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("sleep interrupted");
		}
		System.out.println("pm1: "+pm1+"\npm2: "+pm2);
		System.exit(0);
	}
	public static void main(String args[]){
		PairManager p1=new PairManager1();
		PairManager p2=new PairManager2();
		testApproaches(p1,p2);
	}
}