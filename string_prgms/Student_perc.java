package string_prgms;

public class Student_perc {

	private String name;
	private int id;
	private double perc;

	public Student_perc(String name,int id,double perc) {
		super();
		this.name=name;
		this.id=id;
		this.perc=perc;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public double getperc() {
		return perc;
	}
	public void setper(double per) {
		this.perc=per;
	}
	public int getid() {
		return id;
	}
	
	public String toString() {
		return "Student[id="+id+" name="+name+"+perc="+perc+"]";
	}
}
