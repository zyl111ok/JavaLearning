public class GenericClass<T>{
	private T item;
	
	public void add(T item){
		this.item=item;
	}

	public T get(){
		return this.item;
	}

	public static void main(String args[]){
		GenericClass<String> genericClass=new GenericClass<String>();
		genericClass.add("This is String");
		System.out.println(genericClass.get());

		GenericClass<Integer> g=new GenericClass<Integer>();
		g.add(5);
		System.out.println(g.get()+"");

		GenericClass<DefinedClass> g1=new GenericClass<DefinedClass>();
		g1.add(new DefinedClass());
		System.out.println(g1.get());
	}

}