package office.staff;

import office.utility.ITraveller;

public class Programmer extends Emp implements ITraveller {
	private double extraHours;
	private double chargesPerHour;
	private int daysTravelled;
	
	public Programmer() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public Programmer(String name, int dd, int mm, int yy, int empid, double salary, double extraHours,
			double chargesPerHour, int daysTravelled) {
		super(name, dd, mm, yy, empid, salary);
		this.extraHours = extraHours;
		this.chargesPerHour = chargesPerHour;
		this.daysTravelled = daysTravelled;
	}
	
	


	public int getDaysTravelled() {
		return daysTravelled;
	}

	public String toString() {
		return super.toString()+"\nExtra hours : "+extraHours+"\nCharges Per Hour : "+chargesPerHour;
	}
	
	
	public double calSalary() {
		//basic salary+incentive
		//double gr_sal = super.calSalary()+ (extraHours*chargesPerHour);
		double gr_sal = salary + (extraHours*chargesPerHour) + calculateTA();
		return gr_sal;
	}
	@Override
	public double calculateTA() {
		return daysTravelled*(salary*DA/100);
	}
	
	

}
