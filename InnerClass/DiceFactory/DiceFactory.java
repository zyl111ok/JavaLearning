/**
*�����ڲ���ʹ�ù������ģʽ
*/
public class DiceFactory{

	public interface Toy{
		public void mthrow();
	}
	
	public interface ToyFactory{
		public Toy getToy();
	}
	//!private class Dice implements Toy{}���ܶ��嶯̬�ڲ��࣬��̬�����޷����ʶ�̬��Ա
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
			System.out.println("��ɫ��");
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
			System.out.println("��Ӳ��");
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
		//!dowork(Dice.factory);��̬�������ܷ��ʷǾ�̬��Ա
		DiceFactory df=new DiceFactory();
		df.working();
	}
}