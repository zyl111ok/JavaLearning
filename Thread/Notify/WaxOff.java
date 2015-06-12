public class WaxOff implements Runnable{
	private Car car;
	public WaxOff(Car c){
		car=c;
	}
	public void run(){
		try{
			while(!Thread.interrupted()){
				car.waitForWaxing();
				System.out.print("Wax Off!");
				Thread.sleep(200);
				car.buffed();
			}
		}catch(InterruptedException e){
			System.out.println("Exiting via interrupt");
		}
		System.out.println("Ending Wax Off task");
	}
}