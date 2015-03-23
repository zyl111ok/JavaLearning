public class Rat extends Rodent{
	public static class PFactory implements Factory{
		public Rat create(){
			return new Rat();
		}
	}
}