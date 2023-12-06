class Date{

	private int dd,mm,yy;


	public Date(){
		
	}
	
	public Date(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	

	public void showDate(){
	
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	
	

}