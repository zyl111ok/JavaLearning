/**
*���ñ�������
*/
public class Assignment{
	public static void main(String args[]){
		Tank t1=new Tank();
		Tank t2=new Tank();

		t1.level=9;
		t2.level=4;

		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);

		//���ø�ֵ�Ժ�t1ԭ��������ָ��ֵΪ9�Ķ�������ñ�����,gc���������
		t1=t2;
		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);

		t1.level=27;
		System.out.println("t1 level: "+t1.level+", t2 level: "+t2.level);
	}
}