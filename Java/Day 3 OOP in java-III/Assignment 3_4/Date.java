public class Date{

	private int dd,mm,yy;
	private static int count;

	public Date(){
		
		count++;
	}
	
	public Date(int dd,int mm,int yy){
		count++;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	public void showDate(){
		
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.println("Date object no : "+ count);
	}
	
	


}