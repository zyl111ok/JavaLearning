public abstract class AbstractMessage{
	protected MessageImplementor impl;
	public AbstractMessage(MessageImplementor impl){
		this.impl=impl;
	}
	/**
	*@param message 发送消息类型
	*@param toUser 消息发送对象
	*/
	public void sendMessage(String message,String toUser){
		this.impl.send(message,toUser);
	}
}