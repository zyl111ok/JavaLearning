public class RegisteredFactories{
	public static void main(String args[]){
		for(int i=0;i<30;i++){
			System.out.println(Pets.createRandom());
		}
	}
}