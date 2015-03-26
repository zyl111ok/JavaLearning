public class Checking{
	private static boolean isOnline=true;
	public static void Checker(CreditCheckFactory creditCheckFactory){
		CreditCheck creditCheck=creditCheckFactory.createCreditCheck();
		System.out.println(creditCheck.getClass().getSimpleName()+"���˶�: "+creditCheck.creditLimit(12));
	}
	
	public static void choseWhichToCall(boolean isOnline){
		if(isOnline){
			Checker(CreditCheckOnline.creditCheckFactory);
		}
		else{
			Checker(CreditCheckOffline.creditCheckFactory);
		}
	}
	
	public static void main(String args[]){
		choseWhichToCall(isOnline);
		isOnline=false;
		choseWhichToCall(isOnline);
	}
}