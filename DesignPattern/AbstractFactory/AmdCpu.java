public class AmdCpu implements Cpu{
	private int pins=0;
	public AmdCpu(int pins){
		this.pins=pins;
	}
	public void calculate(){
		System.out.println("AmdCpu ��������Ϊ"+pins);
	}
}