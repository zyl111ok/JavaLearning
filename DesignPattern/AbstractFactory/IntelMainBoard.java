public class IntelMainBoard implements MainBoard{
	private int holes=0;
	public IntelMainBoard(int holes){
		this.holes=holes;
	}
	public void installCpu(){
		System.out.println("Intel����������Ϊ: "+holes);
	}
}