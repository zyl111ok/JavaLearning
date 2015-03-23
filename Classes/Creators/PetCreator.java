package Creators;
import java.util.*;
import PetsHolder.*;
public abstract class PetCreator{
	
	private Random rand=new Random(47);
	
	public abstract List<Class<? extends Pet>> types();

	public Pet randomPets(){
		int n=rand.nextInt(types().size());
		try{
			return types().get(n).newInstance();
		}
		catch(InstantiationException e){
			System.out.println("Instantiate error");
			throw new RuntimeException(e);
		}
		catch(IllegalAccessException e){
			System.out.println("IllegalAccessException");
			throw new RuntimeException(e);
		}
	}
	
	public Pet[] createArray(int size){
		Pet [] result=new Pet[size];
		for(int i=0;i<size;i++){
			result[i]=randomPets();
		}
		return result;
	}
	
	public ArrayList<Pet> getList(int size){
		ArrayList<Pet> list=new ArrayList<Pet>();
		Collections.addAll(list,createArray(size));
		return list;
	}	
	
}