public class DeptManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//部门经理权限在1000以内
		if(fee<1000){
			//只要不是张三在申请，都不同意
			if(user.equals("张三")){
				str="成功： 部门经理同意";
			}else{
				str="失败： 部门经理不同意";
			}
		}else{
			//超过1000，递交给更高级别的人处理
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}