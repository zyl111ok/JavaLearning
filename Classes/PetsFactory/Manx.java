public class Manx extends Cat{
	public static class PFactory implements Factory<Manx>{
		public Manx create(){
			return new Manx();
		}
	}
}