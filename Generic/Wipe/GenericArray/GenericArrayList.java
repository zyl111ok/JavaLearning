import java.util.*;
/**
*the type of  the array is ensured during the compile time,this example shows the way to create a generic array correctly 
*/
public class GenericArrayList<T> implements Iterable<T>{
	private T [] array;
	@SuppressWarnings("unchecked")
	public GenericArrayList(int size){
		array=(T [])new Object[size];
	}
	public void put(int index,T item){
		array[index]=item;
	}
	public T get(int index){
		return  array[index];
	}
	public int size(){
		return array.length;
	}
	public T[] rep(){
		return array;
	}
	public Iterator<T> iterator(){
		return new Iterator<T>(){
			private int index=0;
			public boolean hasNext(){
				return index<array.length;
			}
			public T next(){
				return array[index++];
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	};
	public static void main(String args[]){
		GenericArrayList<Integer> gai=new GenericArrayList<Integer>(5);
		for(int i=0;i<gai.size();i++){
			gai.put(i,i);
		}
		for(Integer i:gai){
			System.out.println(i);	
		}
		Object [] ia=gai.rep();
		System.out.println(ia[2]);
	}
}