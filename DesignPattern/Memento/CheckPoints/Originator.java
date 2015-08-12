import java.util.*;
public class Originator{
	private List<String> states;

	private int index;
	/**
	*���캯��
	*/
	public Originator(){
		states=new ArrayList<String>();
		index=0;
	}
	/**
	*��������������һ���µı���¼����
	*/
	public Memento createMemento(){
		return new Memento(states,index);
	}
	/**
	*�������˻ָ�������¼�����¼��״̬��
	*/
	public void restoreMemento(Memento memento){
		states=memento.getStates();
		index=memento.getIndex();
	}
	/**
	*״̬�ĸ�ֵ����
	*/
	public void setState(String state){
		states.add(state);
		index++;
	}
	/**
	*������������ӡ����״̬
	*/
	public void printStates(){
		for(String state:states){
			System.out.println(state);
		}
	}
}