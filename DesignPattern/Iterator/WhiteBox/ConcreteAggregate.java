public class ConcreteAggregate extends Aggregate{
	private Object [] object=null;
	public ConcreteAggregate(Object [] object){
		this.object=object;
	}
	@Override 
	public Iterator createIterator(){
		return new ConcreteIterator(this);
	}
	public Object getElement(int index){
		if(index<object.length)
			return object[index];
		else 
			return null;
	}
	public int size(){
		return object.length;
	}
}