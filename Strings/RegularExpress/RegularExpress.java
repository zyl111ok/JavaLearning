/**
*������ʽ��ϰ
*/
public class RegularExpress{
	
	private  String tel="";
	private  static String tel1="+8613887613641";
	private  static String tel2="13088627521";
	private  static String tel3="huabdjzsj";
	
	public void setString(String tel){
		this.tel=tel;
	}
	//�õ��绰����
	public String getString(){
		return this.tel;
	}
	/**
	*��������ʽ�ж�һ���绰�����Ƿ���11λ������+86��ʽ��
	*/
	public static void main(String args[]){
		RegularExpress re=new RegularExpress();
		String s[]={tel1,tel2,tel3};
		for(int i=0;i<s.length;i++){
			re.setString(s[i]);
			if(re.getString().matches("(\\+?\\d{11})|(\\+?\\d{13})")){
				System.out.println("\""+s[i]+"\": ƥ��ɹ�");
			}
			else{
				System.out.println("\""+s[i]+"\": ƥ��ʧ��");
			}
		}
		
	}
}