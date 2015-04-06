import java.util.*;
public class Covariant{
	public static void main(String args[]){
		
		Integers [] integer=new Number[5];
		integer[0]=new Number();
		try{
			integer[0]=new Integers();
		}
		catch (Exception e){
			System.out.println(e);
		}
		try{
			List<? extends Integers> list=new ArrayList<Number>();
			//Contravariant
			List<? super Number> list1=new ArrayList<Number>();
			//Okay
			list1.add(new  Figure());
			list1.add(new Number());
			//!list.add(new Number()); forbidden
			list.add(null);
			System.out.println(list);
			System.out.println(list1);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}