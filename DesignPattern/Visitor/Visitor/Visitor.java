public interface Visitor{
	/**
	*对于NodeA的访问操作
	*/
	public void visit(NodeA node);
	/**
	*对于NodeB的访问操作
	*/
	public void visit(NodeB node);
}