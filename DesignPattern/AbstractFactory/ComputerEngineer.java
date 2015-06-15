public class ComputerEngineer{
	private Cpu cpu=null;
	private MainBoard mainBoard=null;

	public void makeComputer(AbstractFactory af){
		prepareHardware(af);
	}

	public void prepareHardware(AbstractFactory af){
		cpu=af.createCpu();
		mainBoard=af.createMainBoard();
		cpu.calculate();
		mainBoard.installCpu();
	}
}