public abstract class Handler{
	/**
	*���еĺ�̶���
	*/
	protected Handler successor;
	/**
	*���崦������ķ���
	*/
	public abstract void handleRequest();
	/**
	*ȡ�ص�ǰ�ĺ�̶���
	*/
	public Handler getSuccessor(){
		return successor;
	}
	/**
	*��ֵ����,���ú������������
	*/
	public void setSuccessor(Handler successor){
		this.successor=successor;
	}
}