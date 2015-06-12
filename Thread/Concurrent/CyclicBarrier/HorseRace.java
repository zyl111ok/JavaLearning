import java.util.*;
import java.util.concurrent.*;
public class HorseRace{
	private final int FINISH_LINE=75;
	private List<Horse> horses=new ArrayList<Horse>();
	private ExecutorService exec=Executors.newCachedThreadPool();
	private CyclicBarrier barrier;
	public HorseRace(int nHorses,final int pause){
		barrier=new CyclicBarrier(nHorses,new Runnable(){
			public void run(){
				StringBuilder s=new StringBuilder();
				for(int i=0;i<FINISH_LINE;i++)
					s.append("=");
				System.out.println(s);
				for(Horse horse:horses)
					System.out.println(horse.tracks());
				for(Horse horse:horses)
					if(horse.getStrides()>=FINISH_LINE){
						System.out.println(horse+"won!");
						exec.shutdownNow();
						return;
					}
				try{
					Thread.sleep(pause);
				}catch(InterruptedException e){
					System.out.println("barrier-action sleep interrupted");
				}
			}
		});
		for(int i=0;i<nHorses;i++){
			Horse horse=new Horse(barrier);
			horses.add(horse);
			exec.execute(horse);
		}
	}
	public static void main(String args[]){
		int nHorses=7;
		int pause=200;
		if(args.length>0){
			int n=new Integer(args[0]);
			nHorses=n>0?n:nHorses;
		}
		if(args.length>1){
			int p=new Integer(args[1]);
			pause=p>-1?p:pause;
		}
		new HorseRace(nHorses,pause);
	}
}