package com.zyl2015.MainClasses;
public class Anonymous{
	private int id;
	
	private Changer change=new Changer(){
		@Override 
		public void setAttribute(int attr){
			id=attr;
		}
		//外部类无法访问内部类private成员
		@Override
		public void print(){
			System.out.println(getAttribute()+" ");
		}
	};
	private Object getAttribute(){
		return this.id;
	}	
	public interface Changer{
		public void setAttribute(int attr);
		public void print();
	}
	public static void main(String args[]){
		Anonymous ay=new Anonymous();
		ay.change.setAttribute(5);
		ay.change.print();
	}
}