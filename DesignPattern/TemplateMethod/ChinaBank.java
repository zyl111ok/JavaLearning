public class ChinaBank extends BankClub{
	@Override 
	protected String doCalculateType(){
		return "China";
	}
	@Override
	protected double doInterestRate(){
		return 4.7;
	}
}