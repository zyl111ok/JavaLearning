public abstract class Handler{
	/**
	*������һ����������Ķ���
	*/
	protected Handler successor=null;
	/**
	*��ȡ����
	*/
	public Handler getSuccessor(){
		return successor;
	}
	/**
	*������һ������
	*/
	public void setSuccessor(Handler successor){
		this.successor=successor;
	}
	/**
	* ����۲ͷ��õ�����
	* @param user ������
	* @param fee �����Ǯ��
	* @return �ɹ�����ʧ�ܵľ���֪ͨ
	*/

	public abstract String handleFeeRequest(String user,double fee);

}