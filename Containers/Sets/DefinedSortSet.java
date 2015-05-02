import java.util.*;
public class DefinedSortSet{
	private static ArrayList<SortType> list1=new ArrayList();
	private static LinkedList<SortType> list2=new LinkedList();
	private static <T> ArrayList<SortType> fill(Class<T> type){
		try{
			Random rand=new Random(47);
			for(int i=0;i<10;i++){
				list1.add((SortType)type.getConstructor(int.class).newInstance(new Random(rand.nextInt(100)).nextInt(1000)));
			}
		}
		catch(Exception e){
			throw new RuntimeException(e);
		}
		return list1;
	}
	private static void sort(){
		for(int i=0;i<list1.size();i++){
			int k=i;
			for(int j=i+1;j<list1.size();j++){
				if(list1.get(k).compareTo(list1.get(j))==-1){
					k=j;
				}
				else if(list1.get(k).compareTo(list1.get(j))==0){
					list1.remove(j);
				}
			}
			if(k!=i){
				int temp=list1.get(i).n;
				list1.get(i).n=list1.get(k).n;
				list1.get(k).n=temp;
			}
			list2.add(list1.get(i));
				
		}
		
	}
	public static void main(String args[]){
		fill(SortType.class);
		sort();
		System.out.println(list1);
		System.out.println(list2);
	}

}