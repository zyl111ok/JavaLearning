/**
*�����н����
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
		//����Ƿ��������ⷿ�߻����Ϣ
		if(colleague == houseOwner){
			tenant.getMessage(message);
		}
		else{
			houseOwner.getMessage(message);
		}
	}
} 