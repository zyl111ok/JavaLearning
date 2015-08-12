public class Client{
	public static void main(String args[]){
		BankClub bank=new USBank();
		System.out.println("美国银行的总额是: "+bank.calculateInterest());
		bank=new ChinaBank();
		System.out.println("中国银行的总额是: "+bank.calculateInterest());
	}
}