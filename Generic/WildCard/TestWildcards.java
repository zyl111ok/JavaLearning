import java.util.*;
public class TestWildcards{
	static Class c []={Figure.class,Integers.class,Number.class};
	@SuppressWarnings("unchecked")
	static  List<?> getList(int n){
		List list=new ArrayList();
		Random rand=new Random(49);
		for(int i=0;i<n;i++){
			try{
				list.add(c[rand.nextInt(3)].newInstance());
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		return list;
	}
	static void invoke(Holder<List<?>>  holder,List<?> list){
		holder.set(list);
		System.out.println(holder.get());
	}
	public static  void main(String args[]){
		List<?> list=getList(5);
		System.out.println(list.get(3).getClass().getSimpleName());
		Holder<List<?>> holder=new Holder<List<?>>();
		invoke(holder,list);
	}
}