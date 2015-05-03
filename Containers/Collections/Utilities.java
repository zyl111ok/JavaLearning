import java.util.*;
/**
*test methods of collections
*/
public class Utilities{
	private static List<String> list=Arrays.asList("one two three four five six one".split(" "));
	
	public static void print(String s){
		System.out.println(s);
	}

	public static void main(String args[]){
		
		print(list.toString());
		print(Collections.disjoint(list,Collections.singletonList("four"))+" ");
		print(Collections.disjoint(list,Collections.singletonList("Four"))+" ");
		print("max: "+Collections.max(list));
		print("min: "+Collections.min(list));
		print("max  comparator "+Collections.max(list,String.CASE_INSENSITIVE_ORDER));
		print("min  comparator "+Collections.min(list,String.CASE_INSENSITIVE_ORDER));
		List<String> subList=Arrays.asList("four five six".split(" "));
		print("indexOfSubList :"+Collections.indexOfSubList(list,subList));
		print("lastindexOfSubList :"+Collections.lastIndexOfSubList(list,subList));
		Collections.replaceAll(list,"one","Yo");
		print("replaceAll: "+list);
		Collections.reverse(list);
		print("reverse: "+list);
		Collections.rotate(list,3);
		print("rotate: "+list);
		List<String> source=Arrays.asList("in the matrix".split(" "));
		Collections.copy(list,source);
		print("copy: "+list);
		Collections.swap(list,0,list.size()-1);
		print("swap: "+list);
		Collections.shuffle(list,new Random(47));
		print("shuffled: "+list);
		Collections.fill(list,"pop");
		print("fill: "+list);
		print("frequency of 'pop': "+Collections.frequency(list,"pop"));
		List<String> dups=Collections.nCopies(3,"snap");
		print("dups: "+dups);
		print("'list' disjoint 'dups'?:  "+Collections.disjoint(list,dups));
		Enumeration<String> e=Collections.enumeration(dups);
		Vector<String> v=new Vector<String>();
		while(e.hasMoreElements())
			v.addElement(e.nextElement());
		ArrayList<String> arrayList=Collections.list(v.elements());
		print("arrayList: "+arrayList);
		List<String> testRotate=Arrays.asList("one two three four five six one".split(" "));
		Collections.rotate(testRotate,1);
		print("rotate: "+testRotate);
	}
}