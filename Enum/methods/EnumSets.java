package methods;
import enumerated.*;
import java.util.*;
public class EnumSets{
	public static void main(String args[]){
		EnumSet<AlarmPoints> points=EnumSet.noneOf(AlarmPoints.class);//empty set
		points.add(AlarmPoints.BATHROOM);
		System.out.println(points);
		points.addAll(EnumSet.of(AlarmPoints.START1,AlarmPoints.START2,AlarmPoints.KITCHEN));
		System.out.println(points);
		points.addAll(EnumSet.range(AlarmPoints.LOBBY,AlarmPoints.OFFICE3));
		System.out.println(points);
	}
}