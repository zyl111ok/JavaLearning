/**
*Test final arguments
*/
public class FinalParameter{
	public void with(final Monster monster){
		
		if(monster==null){
			//!--refused!
			//monster=new Monster("m1");
			System.out.println("null monster");
			return;
		}
		monster.bark();
	}
	public void without(Monster monster){
		//!--accepted
		if(monster==null)
			monster=new Monster("m2");
		monster.bark();
	}
	public static void main(String args[]){
		FinalParameter fp=new FinalParameter();
		Monster m1=null;
		fp.without(m1);
		fp.with(m1);
		m1=new Monster("m1");
		fp.with(m1);

	}
}