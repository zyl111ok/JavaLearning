public class Dog extends Pet{
	public static class PFactory implements Factory<Dog>{
		public Dog create(){
			return new Dog();
		}
	}
}