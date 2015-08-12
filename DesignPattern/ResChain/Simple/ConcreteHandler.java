public class ConcreteHandler extends Handler{
	/**
	*编写具体的处理逻辑
	*/
	@Override
	public void handleRequest(){
		//有后继对象就交给后继对象，没有就处理
		if(getSuccessor()!=null){
			System.out.println("放过请求");
			getSuccessor().handleRequest();
		}else{
			System.out.println("处理请求");
		}
	}
}