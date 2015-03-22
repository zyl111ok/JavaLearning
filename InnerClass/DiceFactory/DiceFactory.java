/**
*匿名内部类使用工厂设计模式
*/
public class DiceFactory{

	public interface Toy{
		public void mthrow();
	}
	
	public interface ToyFactory{
		public Toy getToy();
	}
	//!private class Dice implements Toy{}不能定义动态内部类，静态函数无法访问动态成员
	private static class Dice implements Toy{
		private Dice(){}
		public static ToyFactory factory=new ToyFactory(){
			@Override
			public Toy getToy(){
				return new Dice();
			}
		};
		@Override 
		public void mthrow(){
			System.out.println("掷色子");
		}
		
	}
	
	private static class Coin implements Toy{
		private Coin(){}
		public static ToyFactory factory=new ToyFactory(){
			@Override
			public Toy getToy(){
				return new Coin();
			}
		};
		@Override 
		public void mthrow(){
			System.out.println("掷硬币");
		}
	}
	
	private void working(){
		dowork(Coin.factory);
		dowork(Dice.factory);
	}
	
	private static void dowork(ToyFactory factory){
		Toy toy=factory.getToy();
		toy.mthrow();
	}
	
	public static void main(String args[]){
		//!dowork(Dice.factory);静态方法不能访问非静态成员
		DiceFactory df=new DiceFactory();
		df.working();
	}
}