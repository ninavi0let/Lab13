package PersonClasses;

public class Staff extends Person { 

	private String school;
	private double pay;
	public String getSchool() {
		return school;
	}
	
	
	public Staff(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}


	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]" ;
	}
	
	
}
