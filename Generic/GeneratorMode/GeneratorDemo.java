public class GeneratorDemo{
	public static void main(String args[]){
		Generator<ObjectCounter> gen=BasicGenerator.create(ObjectCounter.class);
		for(int i=0;i<5;i++){
			System.out.println(gen.next());
		}
		/*
		Generator<ObjectCounter> gen1=new BasicGenerator<ObjectCounter>(ObjectCounter.class);
		for(int i=0;i<5;i++){
			System.out.println(gen1.next());
		}*/
	}
}