public class AmdMainBoard implements MainBoard{
	private int holes=0;
	public AmdMainBoard(int holes){
		this.holes=holes;
	}
	public void installCpu(){
		System.out.println("Amd����������Ϊ: "+holes);
	}
}