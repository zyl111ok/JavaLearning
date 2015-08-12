public abstract class BankClub{
	/**
	*top method
	*/
	public final double calculateInterest(){
		double amount=doInterestRate();
		String type=doCalculateType();
		double rate=calculateAmount(type);
		return amount*rate;
	}
	/**
	*abstract method
	*/
	protected abstract String doCalculateType();
	/**
	*hook method
	*/
	protected double doInterestRate(){
		return 0;
	}
	/**
	*concrete method
	*/
	private final double calculateAmount(String type){
		if(type=="US")
			return 6.57;
		else if(type=="China")
			return 1.01;
		else 
			return 0.0;
	}
}