import java.util.*;
/**
*自定义一个栈用来存放运算符
*用链表自定义栈操作
*/
public class OperatorStack{
	private LinkedList list=new LinkedList();
	protected int top=-1;
	public void push(Object obj){
		top++;
		list.addFirst(obj);
	}
	public Object pop(){
		Object obj=list.getFirst();
		top--;
		list.removeFirst();
		return obj;
	}
	public Object getTop(){
		return list.getFirst();
	}
}