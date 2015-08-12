public class Client{
	public static void main(String args[]){
		East east = new SubEast1();
		West west = new SubWest1();
		east.goEast(west);

		east = new SubEast1();
		west = new SubWest2();
		east.goEast(west); 
	}
}