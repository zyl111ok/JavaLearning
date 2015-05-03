import java.lang.ref.*;
import java.util.*;
public class VeryBig{
	private static final int SIZE=10000;
	private long[] la=new long[SIZE];
	private String ident;
	public VeryBig(String id){
		ident=id;
	}
	public String toString(){
		return ident;
	}
	protected void finalize(){
		System.out.println("Finalizing "+ident);
	}
}
