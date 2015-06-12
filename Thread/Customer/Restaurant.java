import java.util.concurrent.*;
public class Restaurant{
	protected Food food;
	protected Customer cust=new Customer(this);
	protected Producer prod=new Producer(this);
	ExecutorService exec=Executors.newCachedThreadPool();
	public Restaurant(){
		exec.execute(cust);
		exec.execute(prod);
	}
	public static void main(String args[]){
		new Restaurant();
	}
}