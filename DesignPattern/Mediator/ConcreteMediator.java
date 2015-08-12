/**
*具体中介对象
*/
public class ConcreteMediator extends Mediator{
	private ConcreteColleagueA houseOwner;
	private ConcreteColleagueB tenant;

	public ConcreteColleagueA getHouseOwner(){
		return houseOwner;
	}

	public void setHouseOwner(ConcreteColleagueA houseOwner){
		this.houseOwner=houseOwner;
	}

	public ConcreteColleagueB getTenant(){
		return tenant;
	}

	public void setTenant(ConcreteColleagueB tenant){
		this.tenant=tenant;
	}

	public void contact(String message,Colleague colleague){
		//如果是房主，则租房者获得信息
		if(colleague == houseOwner){
			tenant.getMessage(message);
		}
		else{
			houseOwner.getMessage(message);
		}
	}
} 