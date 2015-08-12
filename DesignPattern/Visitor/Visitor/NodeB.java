public class NodeB extends Node{
	/**
	*接受操作
	*/
	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	/**
	* NodeA 特有的方法
	*/
	public String operationB(){
		return "NodeB";
	}
}