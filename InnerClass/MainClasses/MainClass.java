package MainClasses;
import InnerClasses.*;
import Interfaces.*;
public class MainClass extends SuperInnerClass{
	 
	public MainClass(){
		this.getImpl().method();
		this.getImpls();
	}
	public TestInner getInterface(){
		return this.getImpl();
	}
	
	public static void main(String args[]){
		MainClass mc=new MainClass();
		if(mc.getInterface()!=null){
			System.out.println("����ת�ͳɹ�");
			mc.getInterface().method();
		}
		else{
			System.out.println("����ת��ʧ��");
		}
	}
	
}