public class ProjectManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//��Ŀ����Ȩ��С��ֻ��500����
		if(fee<500){
			//ֻҪ�������������룬����ͬ��
			if(user.equals("����")){
				str="�ɹ��� ��Ŀ����ͬ��";
			}else{
				str="ʧ�ܣ� ��Ŀ����ͬ��";
			}
		}else{
			//����500���ݽ������߼�����˴���
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}