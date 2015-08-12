public class Adapter implements Target{
	private Adaptee adaptee;
	public Adapter(Adaptee adaptee){
		this.adaptee=adaptee;
	}

	public void Operation1(){
		this.adaptee.Operation1();
	}

	public void Operation2(){
		System.out.println("This is Operation2");
	}
}