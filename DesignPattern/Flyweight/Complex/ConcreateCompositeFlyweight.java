import java.util.*;
public class ConcreateCompositeFlyweight implements Flyweight{
	private Map<Character,Flyweight> files=new HashMap<Character,Flyweight>();

	public void add(Character key,Flyweight fly){
		files.put(key,fly);
	}

	public void operation(String state){
		Flyweight fly=null;
		for(Object o:files.keySet()){
			fly=files.get(o);
			fly.operation(state);
		}
	}
}