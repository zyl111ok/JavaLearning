public class IntelFactory implements AbstractFactory{
	public Cpu createCpu(){
		return new IntelCpu(123);
	}
	public MainBoard createMainBoard(){
		return new IntelMainBoard(123);
	}
}