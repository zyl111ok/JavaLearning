public class Eater implements Runnable{
	private ToastQueue finishedQueue;
	private int counter=0;
	public Eater(ToastQueue finished){
		finishedQueue=finished;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				Toast t=finishedQueue.take();

				if(t.getId()!=counter++ || t.getStatus() !=Toast.Status.JAMMED){
					System.out.println(">>> Error: "+t);
					System.exit(1);
				}
				else{
					System.out.println("Chomp! "+t);
				}
			}
		}catch(InterruptedException e){
			System.out.println("Eater  interrupted");
		}
		System.out.println("Easter off");
	}
}