import java.util.*;
public class Generators{

	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		System.out.println("返回值为Collection类型的方法被调用");
		for(int i=0;i<n;i++)
			coll.add(gen.next());
		return coll;
	}

	public static <T> List<T> fill(List<T> list,Generator<T> gen,int n){
		System.out.println("返回值为List类型的方法被调用");
		for(int i=0;i<n;i++)
			list.add(gen.next());
		return list;
	}

	public static void main(String args[]){
		Collection<Coffee> coffee=fill(new HashSet<Coffee>(),new GeneratorList(),6);
		for(Coffee c:coffee)
			System.out.println(c);

		List<Coffee> coffee1=fill(new ArrayList<Coffee>(),new GeneratorList(),5);
		for(Coffee c:coffee1)
			System.out.println(c);
	}

}