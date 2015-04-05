public class LightBub{
	public static <L extends Attribute&Light> void useLighter(Lighter lighter){
		lighter.lighting();
	} 
	public static <H extends Attribute&Heat>void useHeater(Heater heater){
		heater.heating();
	}
	public static void main(String args[]){
		useLighter(new Lighter(new Holder1()));
		useHeater(new Heater(new Holder2()));
	}
}