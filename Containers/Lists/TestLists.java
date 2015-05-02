package Lists;
import Creator.*;
import java.util.*;
public class TestLists{
	private List<String> listArr=TestAbstractMap.names(4,new ArrayList());
	private List<String> listLink=TestAbstractMap.names(4,new LinkedList());
	@SuppressWarnings("unchecked")
	public void print(String s){
		System.out.println(s);
	}
	
	public void testArrayList(){
		
		ArrayList<String> list=new ArrayList();
		list.addAll(listArr);
		print(list.toString());
		ListIterator<String> x=list.listIterator(list.size()-1);
		x.add("ABC");
		print(x.next());
		x.set("BEIJING");
		x=list.listIterator(list.size());
		while(x.hasPrevious()){
			System.out.print(x.previous()+" ");
		}
		print("");
	}
	
	public void testLinkedList(){
		LinkedList<String> list=new LinkedList();
		list.addAll(listLink);
		print(list.toString());
		list.addFirst("One");
		list.removeLast();
		print(list.toString());

	}
	
	public static void main(String args[]){
		TestLists testList=new TestLists();
		testList.testArrayList();
		testList.testLinkedList();
	}
}