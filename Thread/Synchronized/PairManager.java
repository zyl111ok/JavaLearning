import java.util.concurrent.atomic.*;
import java.util.*;
abstract class PairManager{
	AtomicInteger checkCounter=new AtomicInteger(0);
	protected Pair p=new Pair();
	private List<Pair> storage=Collections.synchronizedList(new ArrayList<Pair>());
	public synchronized Pair getPair(){
		return new Pair(p.getX(),p.getY());
	}
	protected void store(Pair p){
		storage.add(p);
		try{
			Thread.sleep(50);
		}
		catch(InterruptedException ignore){}
	}
	public abstract void increment(); 
}