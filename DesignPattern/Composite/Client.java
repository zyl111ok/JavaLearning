public class Client{
	public static void main(String args[]){
		Company root=new ConcreateCompany();
		root.setName("�����ܹ�˾");
		root.add(new HRDepartment("��������Դ����"));
		root.add(new FinanceDepartment("�ܹ�˾������"));
		Company shandongCom=new ConcreateCompany("ɽ���ֹ�˾");
		shandongCom.add(new HRDepartment("ɽ���ֹ�˾������Դ����"));
		shandongCom.add(new FinanceDepartment("ɽ���ֹ�˾����"));
		Company zaozhuangCom=new ConcreateCompany("��ׯ���´�");
		zaozhuangCom.add(new HRDepartment("��ׯ������Դ����"));
		zaozhuangCom.add(new FinanceDepartment("��ׯ������"));
		Company jinanCom=new ConcreateCompany("���ϰ��´�");
		jinanCom.add(new HRDepartment("����������Դ����"));
		jinanCom.add(new FinanceDepartment("���ϲ�����"));
		shandongCom.add(jinanCom);
		shandongCom.add(zaozhuangCom);

		Company huadongCom=new ConcreateCompany("�Ϻ������ֹ�˾");
		huadongCom.add(new HRDepartment("����������Դ����"));
		huadongCom.add(new FinanceDepartment("����������"));
		Company hangzhouCom=new ConcreateCompany("���ݰ��´�");
		hangzhouCom.add(new HRDepartment("����������Դ����"));
		hangzhouCom.add(new FinanceDepartment("���ݲ�����"));
		Company nanjingCom=new ConcreateCompany("�Ͼ����´�");
		nanjingCom.add(new HRDepartment("�Ͼ�������Դ����"));
		nanjingCom.add(new FinanceDepartment("�Ͼ�������"));
		huadongCom.add(hangzhouCom);
		huadongCom.add(nanjingCom);

		root.add(shandongCom);
		root.add(huadongCom);
		root.display(0);

	}
}