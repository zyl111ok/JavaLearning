//���͵�������ʽ�ƶ���ϰ
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
	//���ͷ�����ʽָ������
	public static void f(Map<String,List<Person>> map){
		System.out.println("f�������ɹ�ִ��");
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