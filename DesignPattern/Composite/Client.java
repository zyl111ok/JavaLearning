public class Client{
	public static void main(String args[]){
		Company root=new ConcreateCompany();
		root.setName("北京总公司");
		root.add(new HRDepartment("总人力资源部门"));
		root.add(new FinanceDepartment("总公司财务部门"));
		Company shandongCom=new ConcreateCompany("山东分公司");
		shandongCom.add(new HRDepartment("山东分公司人力资源部门"));
		shandongCom.add(new FinanceDepartment("山东分公司财务部"));
		Company zaozhuangCom=new ConcreateCompany("枣庄办事处");
		zaozhuangCom.add(new HRDepartment("枣庄人力资源部门"));
		zaozhuangCom.add(new FinanceDepartment("枣庄财务部门"));
		Company jinanCom=new ConcreateCompany("济南办事处");
		jinanCom.add(new HRDepartment("济南人力资源部门"));
		jinanCom.add(new FinanceDepartment("济南财务部门"));
		shandongCom.add(jinanCom);
		shandongCom.add(zaozhuangCom);

		Company huadongCom=new ConcreateCompany("上海华东分公司");
		huadongCom.add(new HRDepartment("华东人力资源部门"));
		huadongCom.add(new FinanceDepartment("华东财务部门"));
		Company hangzhouCom=new ConcreateCompany("杭州办事处");
		hangzhouCom.add(new HRDepartment("杭州人力资源部门"));
		hangzhouCom.add(new FinanceDepartment("杭州财务部门"));
		Company nanjingCom=new ConcreateCompany("南京办事处");
		nanjingCom.add(new HRDepartment("南京人力资源部门"));
		nanjingCom.add(new FinanceDepartment("南京财务部门"));
		huadongCom.add(hangzhouCom);
		huadongCom.add(nanjingCom);

		root.add(shandongCom);
		root.add(huadongCom);
		root.display(0);

	}
}