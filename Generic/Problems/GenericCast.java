public class GenericCast{
	public static final int MAXSIZE=10;
	public static void main(String args[]){
		
		FixSizeStack<String> fss=new FixSizeStack<String>(MAXSIZE);
		System.out.println(fss.size()+"");
		System.out.println(("Hello my name is zhengyl").split(" ").length+"");
		
		for(String s:" Hello my name is zhengyl".split(" "))
			fss.push(s);
		
		while(!fss.isEmpty()){
			String s=fss.pop();
			System.out.print(s+" ");
		}
		
		System.out.println();
	}
}