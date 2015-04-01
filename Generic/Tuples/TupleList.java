import java.util.*;
public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>>{
	public static void main(String args[]){
		TupleList<String,Integer,Double,Amphibian> t1=new TupleList<String,Integer,Double,Amphibian>();
		t1.add(TupleTest.e());
		t1.add(TupleTest.e());
		for(FourTuple<String,Integer,Double,Amphibian> i:t1){
			System.out.println(i);
		}
	}
}