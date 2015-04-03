public class SimpleHolder{
	private Object obj;

	public void set(Object obj){
		this.obj=obj;
	}

	public Object get(){
		return this.obj;
	}

	public static void main(String args[]){
		SimpleHolder holder=new SimpleHolder();
		holder.set("hello world");
		String s=(String)holder.get();
		System.out.println(s);
	}
}