public class TestCast{
	interface Contents{
	    public void setId(int id);
		public int getId();
		public Contents getContent();
	}
	
	private class ConImpl implements Contents{
		private int id;
		public ConImpl(){}
		@Override
		public void setId(int id){
			this.id=id;
		}
		@Override
		public Contents getContent(){
			return this;
		}
		@Override
		public int getId(){
			return this.id;
		}
	}
	
	private Contents getContents(){
		return new ConImpl();
	}
	
	public static void main(String args[]){
		TestCast tc=new TestCast();
		//接口的实现完全不可见，所以可以隐藏细节
		Contents c=tc.getContents();
		c.setId(5);
		System.out.println(c.getId()+" ");
		System.out.println(c.getContent());
	
	}
} 