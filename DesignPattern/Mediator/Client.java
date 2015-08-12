public class Client{
	public static void main(String args[]){
		ConcreteMediator mediator=new ConcreteMediator();

		ConcreteColleagueA houseOwner=new ConcreteColleagueA("张三",mediator);
		ConcreteColleagueB tenant=new ConcreteColleagueB("李四",mediator);

		mediator.setHouseOwner(houseOwner);
		mediator.setTenant(tenant);

		tenant.contact("听说你那里有房子要出租...");
		houseOwner.contact("是的，请问你要出租吗?");
	}
}