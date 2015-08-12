public class Client{
	public static void main(String args[]){
		Object [] object={"one","two","three","four","five"};
		Aggregate agg=new ConcreteAggregate(object);
		Iterator it=agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}
}