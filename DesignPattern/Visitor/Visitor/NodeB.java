public class NodeB extends Node{
	/**
	*���ܲ���
	*/
	@Override
	public void accept(Visitor visitor){
		visitor.visit(this);
	}
	/**
	* NodeA ���еķ���
	*/
	public String operationB(){
		return "NodeB";
	}
}