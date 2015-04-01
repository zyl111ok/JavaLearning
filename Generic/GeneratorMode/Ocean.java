import java.util.*;
public class Ocean{
	public static void eat(BigFish b,LittleFish l){
		System.out.println(b+" eats "+l);
	}
	public static void main(String args[]){
		
		Random rand=new Random(47);
		
		List<LittleFish> littleFish=new ArrayList<LittleFish>();
		Generators.fill(littleFish,LittleFish.generator(),15);
		List<BigFish> bigFish=new ArrayList<BigFish>();
		Generators.fill(bigFish,BigFish.generator,5);
		
		for(LittleFish l:littleFish){
			eat(bigFish.get(rand.nextInt(bigFish.size())),l);
		}
	}
}