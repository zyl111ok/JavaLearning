import java.util.*;
public class FlyweightFactory {
	private Map<Character,Flyweight> files=new HashMap<Character,Flyweight>();

	public Flyweight factory(Character state){
		Flyweight fly=files.get(state);
		if(fly==null){
			fly=new ConcreateFlyweight(state);
			files.put(state,fly);
		}
		return fly;
	}
}