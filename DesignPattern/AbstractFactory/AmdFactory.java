public class AmdFactory implements AbstractFactory{
	public Cpu createCpu(){
		return new AmdCpu(305);
	}
	public MainBoard createMainBoard(){
		return new AmdMainBoard(305);
	}
}