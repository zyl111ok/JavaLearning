import java.util.*;
public class TestHashCode{
	private static List<String> created=new ArrayList<String>();
	private String s;
	private int id=0;
	public TestHashCode(String str){
		s=str;
		created.add(s);
		for(String s2:created)
			if(s2.equals(s))
				id++;
	}
	public String toString(){
		return "String: "+s+" id:"+id+" hashCode(): "+hashCode();
	}
	public int hashCode(){
		int result=17;
		result=37*result+s.hashCode();
		result=37*result+id;
		return result;
	}
	public boolean equals(Object o){
		return o instanceof TestHashCode && s.equals(((TestHashCode)o).s)&& id==((TestHashCode)o).id;
	}
	public static void main(String args[]){
		Map<TestHashCode,Integer>map=new HashMap<TestHashCode,Integer>();
		TestHashCode[] thc=new TestHashCode[5];
		for(int i=0;i<thc.length;i++){
			thc[i]=new TestHashCode("hi");
			map.put(thc[i],i);
		}
		System.out.println(map);
	}
}