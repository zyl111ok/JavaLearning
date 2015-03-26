public class CreditCheckOnline implements CreditCheck{
	public double  creditLimit(int id){
		return 2.3*id;
	}
	public static CreditCheckFactory creditCheckFactory=new CreditCheckFactory(){
		public CreditCheck createCreditCheck(){
			return new CreditCheckOnline();
		}
	};
}