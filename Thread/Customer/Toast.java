public class Toast{
	public enum Status{DRY,BUTTERED,JAMMED}
	private Status status=Status.DRY;
	private final int id;
	public Toast(int idn){id=idn;}
	public void butter(){status=Status.BUTTERED;}
	public void jam(){status=Status.JAMMED;}
	public Status getStatus(){return status;}
	public int getId(){return id;}
	public String toString(){
		return "Toast "+id+": "+status;
	}
}