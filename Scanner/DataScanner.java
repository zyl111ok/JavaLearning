import java.util.*;
public class DataScanner implements Scannable{
	
	private int myInt;
	private long myLong;
	private float myFloat;
	private String myString;
	public static ScannerFactory scan=new ScannerFactory(){
		public Scannable getScannable(){
			return new DataScanner();
		}
	};
	
	private DataScanner(){
	}
	
	private void setInt(int data){this.myInt=data;}
	
	private void setLong(long data){this.myLong=data;}
	
	private void setFloat(float data){this.myFloat=data;}
	
	private void setString(String data){this.myString=data;}
	
	public int getInt(){return this.myInt;}
	
	public long getLong(){return this.myLong;}
	
	public float getFloat(){return this.myFloat;}
	
	public String getString(){return this.myString;}

	@Override
	public void Scan(){
		System.out.println("����������һ�������������������������ַ���");
		try{
			Scanner scan=new Scanner(System.in);
			setInt(scan.nextInt());
			setFloat(scan.nextFloat());
			setLong(scan.nextLong());
			setString(scan.next());
		}
		catch(InputMismatchException e){
			System.out.println("������Ҫ��ƥ��");
		}
	}
	
	@Override
	public void printData(){
		System.out.print(" "+getInt()+" ");
		System.out.print(" "+getFloat()+" ");
		System.out.print(" "+getLong()+" ");
		System.out.print(" "+getString()+" ");
		System.out.println();
	}
} 