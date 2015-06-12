public class WaxOn1 implements Runnable{
	private Car1 car;
	public WaxOn1(Car1 c){car=c;}
	public void run(){
		try{
			while(!Thread.interrupted()){
				System.out.print("Wax On! ");
				Thread.sleep(200);
				car.waxed();
				car.waitForBuffing();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax On task");
	}
}