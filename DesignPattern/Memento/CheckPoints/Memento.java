import java.util.*;
public class Memento{
	private List<String> states;
	private int index;
	/**
	*���캯��
	*/
	public Memento(List<String> states,int index){
		this.states=new ArrayList<String>(states);
		this.index=index;
	}
	public List<String> getStates(){
		return states;
	}
	public int getIndex(){
		return index;
	}
}