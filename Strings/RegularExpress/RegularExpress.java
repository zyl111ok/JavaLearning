/**
*正则表达式练习
*/
public class RegularExpress{
	
	private  String tel="";
	private  static String tel1="+8613887613641";
	private  static String tel2="13088627521";
	private  static String tel3="huabdjzsj";
	
	public void setString(String tel){
		this.tel=tel;
	}
	//得到电话号码
	public String getString(){
		return this.tel;
	}
	/**
	*用正则表达式判断一个电话号码是否是11位或者是+86格式的
	*/
	public static void main(String args[]){
		RegularExpress re=new RegularExpress();
		String s[]={tel1,tel2,tel3};
		for(int i=0;i<s.length;i++){
			re.setString(s[i]);
			if(re.getString().matches("(\\+?\\d{11})|(\\+?\\d{13})")){
				System.out.println("\""+s[i]+"\": 匹配成功");
			}
			else{
				System.out.println("\""+s[i]+"\": 匹配失败");
			}
		}
		
	}
}