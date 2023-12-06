package office.utility;

public class Date{


	private int dd,yy,mm;
	
	public Date(){
		dd=mm=1;
		yy=2023;
	}
	
	public Date(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void display(){
		
		System.out.println(dd+"/"+yy+"/"+mm);
	
	}








}