public class Client{
	public static void main(String args[]){
		ConcreteMediator mediator=new ConcreteMediator();

		ConcreteColleagueA houseOwner=new ConcreteColleagueA("����",mediator);
		ConcreteColleagueB tenant=new ConcreteColleagueB("����",mediator);

		mediator.setHouseOwner(houseOwner);
		mediator.setTenant(tenant);

		tenant.contact("��˵�������з���Ҫ����...");
		houseOwner.contact("�ǵģ�������Ҫ������?");
	}
}