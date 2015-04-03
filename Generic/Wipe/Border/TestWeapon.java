public class TestWeapon{
	public static <T extends Weapon> void attack(T x){
		x.shoot();
		x.stab();
	}
	public static void main(String args[]){
		Rifle r=new Rifle();
		attack(r);
		r.doNothing();
	}
}