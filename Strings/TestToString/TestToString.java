import java.util.*;
public class TestToString{
	
	public String toString(){
		//因为String对象后面跟+后面不是String，编译器又要调用toString方法，所以产生递归调用
		//return "TestToString"+this+"\n";
		return "TestString"+super.toString()+"\n";
	}
	
	public static void main(String args[]){
		List<TestToString> l=new ArrayList<TestToString>();
		for(int i=0;i<10;i++)
			l.add(new TestToString());
		System.out.println(l);
	}
}