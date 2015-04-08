public class GenericMethod{
	//·ºÐÍ·½·¨Á·Ï°
	public static class Test{}
	public <T> void getArg(T x,T y,T z){
		System.out.println(x.getClass().getSimpleName()+" "+y.getClass().getSimpleName()+" "+z.getClass().getSimpleName());
	}
	public static void main(String args[]){
		GenericMethod gm=new GenericMethod();
		gm.getArg("adha",123.3f,new Test());
		gm.getArg(123,"adhwqh",new Test());
	}
}