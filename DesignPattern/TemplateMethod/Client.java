public class Client{
	public static void main(String args[]){
		BankClub bank=new USBank();
		System.out.println("�������е��ܶ���: "+bank.calculateInterest());
		bank=new ChinaBank();
		System.out.println("�й����е��ܶ���: "+bank.calculateInterest());
	}
}