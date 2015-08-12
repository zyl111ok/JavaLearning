import java.util.*;
public class Tank{
	private boolean isFull=false;

	public void makeFull(){
		this.isFull=true;
	}

	public void makeEmpty(){
		this.isFull=false;
	}

	protected void finalize(){
		System.out.println("finalize executed");
		if(isFull){
			System.out.println("Error: not empty!");
		}
	}
}