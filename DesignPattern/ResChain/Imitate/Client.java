public class Client{
	public static void main(String args[]){
		//组装责任链
		Handler h1=new GeneralManager();
		Handler h2=new DeptManager();
		Handler h3=new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);
		
		//开始测试
		System.out.println(h3.handleFeeRequest("张三",300));
		System.out.println(h3.handleFeeRequest("李四",300));
		System.out.println("-----------------------");

		System.out.println(h3.handleFeeRequest("张三",700));
		System.out.println(h3.handleFeeRequest("李四",700));
		System.out.println("-----------------------");

		System.out.println(h3.handleFeeRequest("张三",1300));
		System.out.println(h3.handleFeeRequest("李四",1300));
		System.out.println("-----------------------");				
	}
}