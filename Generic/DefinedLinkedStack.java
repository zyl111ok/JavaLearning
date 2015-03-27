/**
*java¡¥’ª¡∑œ∞
*/
public class DefinedLinkedStack<T>{
	
	private class Node{
		Node next;
		T item;
		Node(){
			item=null;
			next=null;
		}

		Node(T Nodeitem,Node next){
			this.item=Nodeitem;
			this.next=next;
		}
		boolean end(){return item==null && next==null;}
	}

	private Node top=new Node();

	public void push(T item){
		top=new Node(item,top);
	} 

	public T pop(){
		
		T result=top.item;
		if(!top.end()){
			top=top.next;
		}
		return result;
	}
	
	public static void main(String args[]){
		
		DefinedLinkedStack<String> dls=new DefinedLinkedStack<String>();
		for(String s:"Phasers on shut down".split(" ")){
			dls.push(s);
		}
		String s;
		while((s=dls.pop())!=null)
			System.out.println(s);
	}

}