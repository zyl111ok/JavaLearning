import java.util.*;
public class FillingList{
	private static String Contries[][]={{"China","Beijing"},{"Japan","Tokyo"},{"America","Washington"}}; 
	@SuppressWarnings("unchecked")
	public static void main(String ars[]){
		Random rand=new Random(27);
		List<String> list=new ArrayList(Collections.nCopies(2,Contries[1][1]));
		for(int i=0;i<3;i++)
			list.add(Contries[rand.nextInt(3)][rand.nextInt(2)]);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("after shuffle: "+list);
		List<String> list1=new LinkedList(Collections.nCopies(2,Contries[0][1]));
		for(int i=0;i<3;i++)
			list1.add(Contries[rand.nextInt(3)][rand.nextInt(2)]);
		System.out.println(list1);
		Collections.shuffle(list1);
		System.out.println("after shuffle: "+list1);
	}
}