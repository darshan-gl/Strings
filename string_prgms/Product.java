package string_prgms;

public class Product {
	
	private int pid;
	private String pname;
	private double pprice;
	
	public Product(int pid,String pname,double pprice) {
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	public String getname() {
		return pname;
	}
	public void setname() {
		 this.pname=pname;
	}
	public double getprice() {
		return pprice;
	}
	public void setprice(double price) {
		this.pprice=pprice;
	}
	public int getid() {
		return pid;
	}
	public String toString() {
		return "Student[id="+pid+" name="+pname+"+price="+pprice+"]";
	}
}
