public class Reflector{
	public int id;
	
	public interface Interface{
		public void method();
	}
	public  Reflector(int id){
		this.id=id;
	}
	
	public Double Calculate(Integer id1,Integer id2,Double id3){
		return (id1+id2)*id3;
	}
}