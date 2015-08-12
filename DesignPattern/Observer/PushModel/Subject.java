import java.util.*;
public class Subject{
	private List<Observer> list=new ArrayList();
	/**
	*ע��۲���
	*/
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attach an observer");
	}
	/**
	*ɾ���۲���
	*/
	public void detach(Observer observer){
		list.remove(observer);
	}
	/**
	*֪ͨע������й۲��߶���
	*/
	public void nodifyObservers(String newState){
		for(Observer observer:list){
			observer.update(newState);
		}
	} 
}