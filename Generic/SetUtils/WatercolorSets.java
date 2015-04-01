import java.util.*;
import java.lang.reflect.*;
public class WatercolorSets{
	
	public static void main(String args[]){
		
		Set<Watercolors> set1=EnumSet.range(Watercolors.ZINC,Watercolors.COBALT_BLUE_HUE);
		Set<Watercolors> set2=EnumSet.range(Watercolors.MAGENTA,Watercolors.BURNT_SIENNA);
		
		System.out.println("set1 :"+set1);
		System.out.println("set2 :"+set2);
		
		Set<Watercolors> subset=SetUtil.intersection(set1,set2);
		
		System.out.println("subset :"+subset);
		System.out.println("difference set1:"+SetUtil.difference(set1,subset));
		System.out.println("difference set2:"+SetUtil.difference(set2,subset));
		System.out.println("complement :"+SetUtil.complement(set1,set2));

	}
}