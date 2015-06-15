public class IntelCpu implements Cpu{
	private int pins=0;
	public IntelCpu(int pins){
		this.pins=pins;
	}
	public void calculate(){
		System.out.println("Intel Cpu的引脚数为: "+pins);
	}
}
