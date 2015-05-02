package Utils;
public abstract class Test<C>{
	public String name;
	public Test(String name){
		this.name=name;
	}
	public abstract int test(C container,TestParam tp);
} 