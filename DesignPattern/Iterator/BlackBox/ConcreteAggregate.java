public class ConcreteAggregate extends Aggregate{
	private Object [] object=null;
	public ConcreteAggregate(Object [] object){
		this.object=object;
	}
	@Override 
	public Iterator createIterator(){
		return new ConcreteIterator();
	}
	private class ConcreteIterator implements Iterator{
		private int index;
		private int size=0;
		public ConcreteIterator(){
			index=0;
			size=object.length;
		}
		@Override
		public Object currentItem(){
			return object[index];
		}
		@Override
		public void first(){
			index=0;
		}
		@Override
		public boolean isDone(){
			return (index>=size);
		}
		@Override
		public void next(){
			if(index<size)
				index++;
		}
	}
}