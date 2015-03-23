package Creators;
import PetsHolder.*;
import java.util.*;
public class ForNameCreator extends PetCreator{
	
	private static ArrayList<Class<? extends Pet>> list=new ArrayList<Class<?extends Pet>>();
	private static String[] names={"PetsHolder.Pet","PetsHolder.Cat","PetsHolder.Dog",
	"PetsHolder.Manx","PetsHolder.Mutt","PetsHolder.Rat","PetsHolder.Rodent"};
	public static void loader(){
		try{
			for(String name:names){
				list.add((Class<? extends Pet>)Class.forName(name));
			}
		}
		catch(ClassNotFoundException e){
			System.out.println("ClassNotFoundException");
		}
	}
	static{loader();}
	
	public List<Class<? extends Pet>> types(){return list;}

}