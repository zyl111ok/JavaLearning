import java.util.*;
public class Bery implements Comparable<Bery> {
	
	private static  int count=1;

	private int i,j,k;
	
	private static Random rand=new Random(47);
	public Bery(int i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k; 
	}

	public String toString(){
		String result="[ i= "+i+", j ="+j+", k= "+k+"]";
			if(count++%2==0)
				result+="\n";
		return result;
	}

	public int compareTo(Bery bl){
		return j<bl.j ? -1:(j==bl.j ? 0:1);
	}

	public static Generator<Bery> generator(){
		
		return new Generator<Bery>(){
			
			public Bery next(){
				return new Bery(rand.nextInt(50),rand.nextInt(50),rand.nextInt(50));
			}
		};
	}

	public static void main(String args[]){
		
		Bery [] b=new Bery[12];
		for(int i=0;i<b.length;i++)
			b[i]=Bery.generator().next();
		System.out.println("before sort: \n"+Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("after sort:\n"+Arrays.toString(b));
	}



}