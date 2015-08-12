import java.util.*;
public class Client{
	public static void main(String args[]){
		List<Character> compositeState=new ArrayList<Character>();
		compositeState.add('a');
		compositeState.add('b');
		compositeState.add('c');
		compositeState.add('a');
		compositeState.add('b');

		FlyweightFactory flyFactory=new FlyweightFactory();
		Flyweight compositeFly1=flyFactory.factory(compositeState),
				  compositeFly2=flyFactory.factory(compositeState);

	    compositeFly1.operation("Composite Call");
	    System.out.println("-----------------------");
	    System.out.println("������Ԫ�Ƿ������ "+(compositeFly1==compositeFly2));
	    Character state='a';
	    Flyweight fly1=flyFactory.factory(state);
	    Flyweight fly2=flyFactory.factory(state);
	    System.out.println("������Ԫ�Ƿ������ "+(fly1==fly2));

	}
}