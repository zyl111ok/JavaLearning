public class NodeA extends Node{
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
	public String operationA(){
		return "NodeA";
	}
}