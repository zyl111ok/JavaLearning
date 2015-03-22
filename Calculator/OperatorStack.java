import java.util.*;
/**
*�Զ���һ��ջ������������
*�������Զ���ջ����
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