public class DeptManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//���ž���Ȩ����1000����
		if(fee<1000){
			//ֻҪ�������������룬����ͬ��
			if(user.equals("����")){
				str="�ɹ��� ���ž���ͬ��";
			}else{
				str="ʧ�ܣ� ���ž���ͬ��";
			}
		}else{
			//����1000���ݽ������߼�����˴���
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}