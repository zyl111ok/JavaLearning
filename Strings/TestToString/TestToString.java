import java.util.*;
public class TestToString{
	
	public String toString(){
		//��ΪString��������+���治��String����������Ҫ����toString���������Բ����ݹ����
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