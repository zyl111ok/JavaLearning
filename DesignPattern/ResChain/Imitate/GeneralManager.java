public class GeneralManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//总经理大权限，能处理所有的
		if(fee>=1000){
			//只要不是张三在申请，都不同意
			if(user.equals("张三")){
				str="成功： 总经理同意";
			}else{
				str="失败： 总经理不同意";
			}
		}else{
			//还有后继，继续处理
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}