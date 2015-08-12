public class ConcreteSubject extends Subject{
	private String state;
	public String getState(){
		return state;
	}
	public void change(String newState){
		state=newState;
		System.out.println("Ö÷Ìâ×´Ì¬Îª: "+state);
		this.nodifyObservers(state);
	}
}