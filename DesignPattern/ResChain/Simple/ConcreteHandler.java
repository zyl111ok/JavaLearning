public class ConcreteHandler extends Handler{
	/**
	*��д����Ĵ����߼�
	*/
	@Override
	public void handleRequest(){
		//�к�̶���ͽ�����̶���û�оʹ���
		if(getSuccessor()!=null){
			System.out.println("�Ź�����");
			getSuccessor().handleRequest();
		}else{
			System.out.println("��������");
		}
	}
}