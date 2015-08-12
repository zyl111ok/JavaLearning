public abstract class Handler{
	/**
	*持有下一个处理请求的对象
	*/
	protected Handler successor=null;
	/**
	*获取对象
	*/
	public Handler getSuccessor(){
		return successor;
	}
	/**
	*设置下一级对象
	*/
	public void setSuccessor(Handler successor){
		this.successor=successor;
	}
	/**
	* 处理聚餐费用的申请
	* @param user 申请人
	* @param fee 申请的钱数
	* @return 成功或者失败的具体通知
	*/

	public abstract String handleFeeRequest(String user,double fee);

}