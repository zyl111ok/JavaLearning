import java.util.*;
public class Pets{
	public static final Creature creature=new Creature();
	
	public String toString(){
		return creature.toString();
	}
	
	public static Creature createRandom(){
		return creature.createRandom();
	}
}