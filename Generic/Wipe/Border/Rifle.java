public class Rifle implements Weapon{
	
	@Override
	public void shoot(){
		System.out.println("Rifle:   shoot!");
	}
	
	@Override
	public void stab(){
		System.out.println("Rifle:   stab");
	}

	public void doNothing(){
		System.out.println("doNothing!");
	} 
}