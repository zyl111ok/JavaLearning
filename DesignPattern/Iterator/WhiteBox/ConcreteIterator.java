public class ConcreteIterator implements Iterator{
	private ConcreteAggregate agg;
	private int index;
	private int size;
	public ConcreteIterator(ConcreteAggregate agg){
		this.agg=agg;
		index=0;
		size=agg.size();
	}
	@Override
	public Object currentItem(){
		return agg.getElement(index);
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