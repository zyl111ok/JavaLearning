public class USBank extends BankClub{
	@Override 
	protected String doCalculateType(){
		return "US";
	}
	@Override
	protected double doInterestRate(){
		return 3.6;
	}
}