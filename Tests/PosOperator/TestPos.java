/**
*按位,移位操作符练习
*/
public class TestPos{
	public static void main(String args[]){
		byte b='a';
		int c='b';
		int i1=0xa;
		int i2=0x5;
		int i3=i1 & i2,
		i4=i1 | i2,
		i5=~i1,
		i6=i1^i2;

		System.out.println("与运算的结果"+Integer.toBinaryString(i3));
		System.out.println("或运算的结果"+Integer.toBinaryString(i4));
		System.out.println("非运算的结果"+Integer.toBinaryString(i5));
		System.out.println("异或运算的结果"+Integer.toBinaryString(i6));
	
		int a=0xff;
		a>>>=5;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(b+"  "+c);

	}
}