import java.util.*;
public class Subject{
	private List<Observer> list=new ArrayList();
	/**
	*注册观察者
	*/
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("Attach an observer");
	}
	/**
	*删除观察者
	*/
	public void detach(Observer observer){
		list.remove(observer);
	}
	/**
	*通知注册的所有观察者对象
	*/
	public void nodifyObservers(String newState){
		for(Observer observer:list){
			observer.update(newState);
		}
	} 
}