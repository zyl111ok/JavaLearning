public interface MessageImplementor{
	/**
	*@param  message 消息内容 
	*@param  toUser 消息发送对象
	*/
	public void send(String message,String toUser);
}