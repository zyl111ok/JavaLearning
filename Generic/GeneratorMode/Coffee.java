/**
*������ģʽ�̳���ϵ
*/
public class Coffee{
	private static long counter=0;
	private final long id=counter++;
	
	public String toString(){
		
		return this.getClass().getSimpleName()+" "+id;
	}
}