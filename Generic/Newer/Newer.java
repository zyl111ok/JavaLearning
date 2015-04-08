//泛型的类型显式推断练习
import java.util.*;
public class Newer{
	
	public static <K,V> Map<K,V> map(){
		return new HashMap<K,V>();
	}

	public static<T> List<T> list(){
		return new ArrayList<T>();
	}

	public static <T> Queue<T> queue(){
		return new LinkedList<T>();
	}
	//泛型方法显式指明类型
	public static void f(Map<String,List<Person>> map){
		System.out.println("f方法被成功执行");
	}

	public static void main(String args[]){
		
		List<Person> list=Newer.list();
		list.add(new Student());
		list.add(new Teacher());
		
		Map<String,List<Person>> map=Newer.map();
		map.put("P1",list);
		System.out.println(map.get("P1").get(0));
		System.out.println(map.get("P1").get(1));
		
		Queue<Teacher> queue=Newer.queue();

		f(Newer.<String,List<Person>>map());
	}
}