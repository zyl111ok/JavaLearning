package PetsCounter;
import Creators.*;
import PetsHolder.*;
import java.util.*;
public class PetCounter{
	static class Counter extends HashMap<String,Integer>{
		public void count(String type){
			Integer counts=get(type);
			if(counts==null){
				put(type,1);
			}
			else{
				put(type,counts+1);
			}
		}
	}
	public static void countPets(PetCreator creator){
		Counter petCounter=new Counter();
		for(Pet pet:creator.getList(20)){
			System.out.print(pet.getClass().getSimpleName()+" ");
			if(pet instanceof Pet){
				petCounter.count("Pet");
			}
			if(pet instanceof Cat){
				petCounter.count("Cat");
			}
			if(pet instanceof Dog){
				petCounter.count("Dog");
			}
			if(pet instanceof Manx){
				petCounter.count("Manx");
			}
			if(pet instanceof Rat){
				petCounter.count("Rat");
			}
			if(pet instanceof Rodent){
				petCounter.count("Rodent");
			}
		}
		System.out.println();
		System.out.println(petCounter);
	}
	public static void main(String args[]){
		countPets(new ForNameCreator());
	}
}