public class Client{
	public static void main(String args[]){
		//��װ������
		Handler h1=new GeneralManager();
		Handler h2=new DeptManager();
		Handler h3=new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//��ʼ����
		System.out.println(h3.handleFeeRequest("����",300));
		System.out.println(h3.handleFeeRequest("����",300));
		System.out.println("-----------------------");

		System.out.println(h3.handleFeeRequest("����",700));
		System.out.println(h3.handleFeeRequest("����",700));
		System.out.println("-----------------------");

		System.out.println(h3.handleFeeRequest("����",1300));
		System.out.println(h3.handleFeeRequest("����",1300));
		System.out.println("-----------------------");				
	}
}