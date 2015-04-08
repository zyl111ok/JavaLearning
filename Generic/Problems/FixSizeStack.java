public class FixSizeStack<T>{

	private int maxSize;
	private int top= -1;
	private Object storge[];
	
	public FixSizeStack(int size){
		maxSize=size;
		storge=new Object[maxSize];
	}

	public void push(T item){
		storge[++top]=item;
	}
	@SuppressWarnings("unchecked")
	public T pop(){
		return (T)storge[top--];
	}

	public int size(){
		return storge.length;
	}
	 
	public boolean isEmpty(){
		return top== -1;
	}		
}