public class GeneralManager extends Handler{
	@Override 
	public String handleFeeRequest(String user,double fee){
		String str=" ";
		//�ܾ����Ȩ�ޣ��ܴ������е�
		if(fee>=1000){
			//ֻҪ�������������룬����ͬ��
			if(user.equals("����")){
				str="�ɹ��� �ܾ���ͬ��";
			}else{
				str="ʧ�ܣ� �ܾ���ͬ��";
			}
		}else{
			//���к�̣���������
			if(getSuccessor()!=null){
				return getSuccessor().handleFeeRequest(user,fee);
			}
		}
		return str;
	}
}