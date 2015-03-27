/**
*题目要求: 输入数字，输出相应的灰色颜色码,如，输入5，返回new string{#010101,#020202,#030303,#040404,#050505}
*/
public class GreyArray{
	
	public static String[] shadesOfGrey(int num){
		
		if(num==-1||num==0){
			return new String[0];
		}
		
		else{
			
			StringBuilder str=new StringBuilder();
			
			for(int i=1;i<=num;i++){
				String tens=change((int)(i/16)+"");
				String single=change(i%16+"");
				str.append("#"+tens+single+tens+single+tens+single+" ");
				if(i>253){break;}
			}
			String result[]=str.toString().split(" ");
			for(int i=0;i<result.length;i++){
				System.out.print(result[i]+" ");
			}
			
			return result;
		}
	}
	//十进制与十六进制之间的转换
	public static String change(String s){
		if(s.equals("10")){
			return "a";
		}
		else if(s.equals("11")){
			return "b";
		}
		else if(s.equals("12")){
			return "c";
		}
		else if(s.equals("13")){
			return "d";
		}
		else if(s.equals("14")){
			return "e";
		}
		else if(s.equals("15")){
			return "f";
		}
		else return s;
	}

	public static void main(String args[]){
		System.out.println(shadesOfGrey(5000));
	}

}