import java.util.*;
public class FlyWeightFactory{

	private Hashtable flyweights=new Hashtable();
	
	public FlyWeightFactory(){}
	@SuppressWarnings("unchecked")
	public Flyweight getFlyweight(int i){
		Flyweight flyweight=(Flyweight)flyweights.get(i);
		if(flyweight==null){
			flyweight=new ConcreateFlyWeight(i);
			flyweights.put(i,flyweight);
		}
		return flyweight;
	}
	@SuppressWarnings("unchecked")
	public Flyweight getFlyweight(String str){
		Flyweight flyweight=(Flyweight)flyweights.get(str);
		if(flyweight==null){
			flyweight=new ConcreateFlyWeight(str);
			flyweights.put(str,flyweight);
		}
		return flyweight;
	}

	public int FlyWeightFactorySize(){
		return flyweights.size();
	}
}