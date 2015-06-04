public class MoreBasicThread{
	public static void main(String args[]){
		for(int i=0;i<5;i++){
			Thread r=new Thread(new LiftOff());
			r.start();
		}
		System.out.println("Waiting for liftoff!");
	}
}