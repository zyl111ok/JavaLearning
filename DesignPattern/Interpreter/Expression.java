/**
*������ģʽ��ģ��java�Բ������ʽ�Ĳ�����ֵ
*������ʽģ��
*/
public abstract class Expression{
	//���������͸������κ�һ�����ʽ
	public abstract boolean interpret(Context ctx);
	//����������ʽ�ṹ���Ƿ���ͬ
	public abstract boolean equals(Object obj);
	//���ر��ʽ��hashcode
	public abstract int hashCode();
	//�����ʽת��Ϊ�ַ���
	public abstract String toString();
}