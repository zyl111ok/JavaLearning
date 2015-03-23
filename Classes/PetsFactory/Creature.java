import java.util.*;
public class Creature{
	
	private static Random rand=new Random();
	
	public String toString(){
		return getClass().getSimpleName();
	}
	
	public static List<Factory<? extends Creature>> factories =new ArrayList<Factory<? extends Creature>>();
	
	
	static{
		factories.add(new Pet.PFactory());
		factories.add(new Dog.PFactory());
		factories.add(new Cat.PFactory());
		factories.add(new Manx.PFactory());
		factories.add(new Rodent.PFactory());
		factories.add(new Rat.PFactory());
	}
	
	public Creature createRandom(){
			int n=rand.nextInt(factories.size());
			return factories.get(n).create();
	}
}