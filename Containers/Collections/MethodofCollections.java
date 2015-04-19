import java.util.*;
public class MethodofCollections{
	@SuppressWarnings("unchecked")
	
	public static void main(String args[]){
		Collection<String> c=new ArrayList();
		List<String> list=new ArrayList();
		String data[]={"uestc","ustc","etc","qinghua","peking"};
		
		for(int i=0;i<data.length;i++)
			list.add(data[i]);
		c.addAll(list);
		
		System.out.println(c);
		System.out.println(c.contains("etc"));
		System.out.println(c.equals("qinghua"));
		System.out.println(c.hashCode()+"");
		Iterator it=c.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println(c.toArray().toString());

		c.addAll(Arrays.asList(("A B C D E F").split(" ")));
		Collection<String> c1=new ArrayList(Arrays.asList(("A B C D E F").split(" ")));
		c1.add("abc");

		try{
			Collection<String> c2=Arrays.asList(("A B C D E F").split(" "));
			c2.add("abc");
		}
		catch(UnsupportedOperationException e){
			System.out.println("Line 34 UnsupportedOperationException");
		}
	} 
}											