/**
*解释器模式，模拟java对布尔表达式的操作求值
*环境模型
*/
import java.util.*;
public class Context{
	private Map<Variable,Boolean> map=new HashMap<Variable,Boolean>();

	public void assign(Variable var,boolean value){
		map.put(var,new Boolean(value));
	}

	public boolean lookup(Variable var)throws IllegalArgumentException{
		Boolean value=map.get(var);
		if(value==null){
			throw new IllegalArgumentException();
		}
		return value.booleanValue();
	}
}