public class Lighter<L extends Attribute&Light> implements Light{
	L l;
	public Lighter(L l){
		this.l=l;
	}
	public  String lighting(){
		System.out.println(l.lighting()+": "+l.template);
		return null;
	}
}