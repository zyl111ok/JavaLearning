public abstract class Prototype{
	public void sayHello(){
		System.out.println("HelloWorld!");
	}
	public abstract Object clone();
}