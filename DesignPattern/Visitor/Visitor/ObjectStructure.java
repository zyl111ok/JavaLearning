import java.util.*;
public class ObjectStructure{
	private List<Node> nodes=new ArrayList<Node>();
	/**
	*ִ�з�������
	*/
	public void action(Visitor visitor){
		for(Node node:nodes)
			node.accept(visitor);
	}
	/**
	*���һ����Ԫ��
	*/
	public void add(Node node){
		nodes.add(node);
	}

}