public class GenericHolder<T extends Object>{
	private T obj;
	
	public void set(T obj){
		this.obj=obj;
	}
	
	public T get(){return obj;}
	
	public static void main(String args[]){
		GenericHolder<String> holder=new GenericHolder<String>();
		holder.set("hello world!");
		String s=holder.get();
		System.out.println(s);
	}
}