public class BasicGenerator<T> implements Generator<T>{
	private Class<T> type;

	private BasicGenerator(Class<T> type){
		this.type=type;
	}

	public T next(){
		try{
			return type.newInstance();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
			return null;
		}
		catch(InstantiationException e){
			e.printStackTrace();
			return null;
		}
	}

	public static <T> Generator<T> create(Class<T> type){
		return new BasicGenerator<T>(type);
	}	
}