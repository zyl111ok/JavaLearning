public abstract class Handler{
	/**
	*持有的后继对象
	*/
	protected Handler successor;
	/**
	*具体处理请求的方法
	*/
	public abstract void handleRequest();
	/**
	*取回当前的后继对象
	*/
	public Handler getSuccessor(){
		return successor;
	}
	/**
	*赋值方法,设置后继责任链对象
	*/
	public void setSuccessor(Handler successor){
		this.successor=successor;
	}
}