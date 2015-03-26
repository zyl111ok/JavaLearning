public class CreditCheckOffline implements CreditCheck{
	public double creditLimit(int id){
		return 3.4*id;
	}
	public static CreditCheckFactory creditCheckFactory=new CreditCheckFactory(){
		public CreditCheck createCreditCheck(){
			return new CreditCheckOffline();
		}
	};
}