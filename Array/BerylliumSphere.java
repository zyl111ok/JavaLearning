public class BerylliumSphere{
	private static  int count=0;
	
	private final int id=count++;
	
	public BerylliumSphere(){ }

	public String toString(){
		return this.getClass().getSimpleName()+id;
	}


}