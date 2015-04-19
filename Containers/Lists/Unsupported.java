import java.util.*;
public class Unsupported{
	public static void main(String args[]){
		List<String> list=Arrays.asList("A B C D E F".split(" "));
		List<String> list1=new ArrayList();
		list1.addAll(list);
		try{
			list.remove(2);
		}
		catch(UnsupportedOperationException e){
			System.out.println("UnsupportedOperationException");
		}
		list1.remove(1);
		System.out.println(list1);
	}	
}