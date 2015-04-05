public class Creator extends GenericWithCreate<X>{
	protected X create(){
		return new X();
	}
	protected void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}