/**
*登记式单例模式
*/
import java.util.*;
public class SingleTon3{
	private static Map<String,SingleTon3> map=new HashMap<String,SingleTon3>();
	static{
		SingleTon3 single=new SingleTon3();
		map.put(SingleTon3.class.getSimpleName(),single);
	}
	protected SingleTon3(){}
	public static SingleTon3 getInstance(String name)throws Exception{
		if(name==null){
			name=SingleTon3.class.getSimpleName();
		}
		if(map.get(name)==null){
			map.put(name,(SingleTon3)Class.forName(name).newInstance());
		}
		return map.get(name);	
	}
}