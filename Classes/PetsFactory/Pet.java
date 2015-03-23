public class Pet extends Creature{
	public static class PFactory implements Factory<Pet>{
		public Pet create(){return new Pet();}
	}	
}