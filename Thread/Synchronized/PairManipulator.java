public class PairManipulator implements Runnable{
	private PairManager pm;
	public PairManipulator(PairManager pm){
		this.pm=pm;
	}
	public void run(){
		while(true)
			pm.increment();
	}
	public String toString(){
		return "Pair: "+pm.getPair()+"checkCounter = "+pm.checkCounter.get();
	}
}