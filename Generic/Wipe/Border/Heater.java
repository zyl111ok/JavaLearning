public class Heater<H extends Attribute&Heat> implements Heat{
	H h;
	public Heater(H h){
		this.h=h;
	}
	public String heating(){
		System.out.println(h.heating()+": "+h.energy);
		return null;
	}
}