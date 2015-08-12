import java.util.*;
public class Caretaker{
	private Originator o;
	private List<Memento> mementos =new ArrayList<Memento>();
	private int current;
	/**
	*���캯��
	*/
	public Caretaker(Originator o){
		this.o=o;
		current=0;
	}
	/**
	*����һ���µļ���
	*/
	public int createMemento(){
		Memento memento=o.createMemento();
		mementos.add(memento);
		return current++;
	}
	/**
	*�������˻ָ���ĳ������
	*/
	public void restoreMemento(int index){
		Memento memento=mementos.get(index);
		o.restoreMemento(memento);
	}
	/**
	*��ĳ������ɾ��
	*/
	public void removeMemento(int index){
		mementos.remove(index);
	}
}