public class Rodent extends Pet{
	public static class PFactory implements Factory<Rodent>{
		public Rodent create(){return new Rodent();}
	}	
}