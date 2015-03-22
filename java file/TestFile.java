import java.util.*;
public class TestFile{
	private static String state="state";
	private static String id="123";
	private static String name="tom";
	private UserInfo userInfo=new UserInfo();
	
	private void writeInfo(String state,String id,String name){
		Map<String,String> map=new HashMap<String,String>();
		map.put("login",state);
		map.put("id",id);
		map.put("name",name);
		userInfo.updateUserInfo(map);
	}
	
	private String getString(){
		return userInfo.getUserInfo();
	}
	
	private Map<String,String> getMap(){
		return userInfo.buildUserMap(TestFile.this.getString());
	}
	
	public static void main(String args[]){
		TestFile tf=new TestFile();
		tf.writeInfo(state,id,name);
		System.out.println(tf.getString());
		System.out.println(tf.getMap());
	}
}