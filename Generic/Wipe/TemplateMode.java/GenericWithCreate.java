/**
*template method class
*/
public abstract class GenericWithCreate<T>{
	protected final  T element;
	protected GenericWithCreate(){
		element=create();
	}
	abstract T create();
}