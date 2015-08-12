public abstract class AbstractMessage{
	protected MessageImplementor impl;
	public AbstractMessage(MessageImplementor impl){
		this.impl=impl;
	}
	/**
	*@param message ������Ϣ����
	*@param toUser ��Ϣ���Ͷ���
	*/
	public void sendMessage(String message,String toUser){
		this.impl.send(message,toUser);
	}
}