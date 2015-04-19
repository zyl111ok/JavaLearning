public class ConcreateFlyWeight extends Flyweight{
	private String str;
	private int i;
	public ConcreateFlyWeight(String str){
		this.str=str;
	}
	public ConcreateFlyWeight(int i){
		this.i=i;
	}
	@Override
	public void operation(){
		if(str!=null){
			System.out.println("ConcreateFlyWeight"+i+": "+str);
		}
		else 
			System.out.println("ConcreateFlyWeight"+i+" ");
	}
	
}