public class TestFinalize{
	protected void finalize(){
		System.out.println("main finalize executed");
	}
	public static void main(String args[]){
		TestFinalize tf=new TestFinalize();
		System.gc();
		Tank t=new Tank();
		Tank k=new Tank();
		t.makeFull();
		k.makeFull();
		t.makeEmpty();
		System.gc();

	}
}