import java.util.*;

public class RandomList<T>{
	
	private List<T> list=new ArrayList<T>();
	private Random rand=new Random(47);

	public void add(T item){list.add(item);}
	
	public T select(){
		return list.get(rand.nextInt(list.size()));
	}

	public int size(){
		return list.size();
	}

	public static void main(String args[]){
		
		RandomList<String> list=new RandomList<String>();
		
		for(String s:"Hi my name is zhengyl".split(" ")){
			list.add(s);
		}
		for(int i=0;i<list.size();i++){
			System.out.print(list.select()+" ");
		}
		System.out.println();
		RandomList<Integer> list1=new RandomList<Integer>();
		
		for(int i=0;i<9;i++){
			list1.add(i);
		}
		for(int i=0;i<list1.size();i++){
			System.out.print(list1.select()+" ");
		}
	}

}
