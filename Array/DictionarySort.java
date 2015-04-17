import java.util.*;
public class DictionarySort{
	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		
		List<String> list=new ArrayList();
		list.add("四川");
		list.add("陕西");
		list.add("北京");
		list.add("广东");
		System.out.println("before sort :");
		for(String s:list)
			System.out.print(s+", ");
		System.out.println();
		Collections.sort(list,new ChineseComparee());
		System.out.println("after sott :");
		for(String s:list)
			System.out.print(s+", ");
		System.out.println();
	}

}