public class ProjectManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//项目经理权限小，只能500以内
		if(fee<500){
			//只要不是张三在申请，都不同意
			if(user.equals("张三")){
				str="成功： 项目经理同意";
			}else{
				str="失败： 项目经理不同意";
			}
		}else{
			//超过500，递交给更高级别的人处理
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}