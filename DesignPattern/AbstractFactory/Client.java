public class Client{
	public static void main(String args[]){
		 AbstractFactory af=new IntelFactory();
		 ComputerEngineer ce=new ComputerEngineer();
		 ce.makeComputer(af);
	}
}