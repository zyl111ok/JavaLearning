public class Cat extends Pet{
	public static class PFactory implements Factory<Cat>{
		public Cat create(){return new Cat();}
	}
}