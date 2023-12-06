class Date
{
   //data members
   private int dd;
   private int mm;
   private int yy;

   //initializer block - copied to each constructor
   //common for all constructors
   //will get executed at the beginning of each constructor 		
   {
	System.out.println("in Date constructor");
   }				
   //no-arg constructor
   public Date()
   {
	//
   }	

   //full parameterized constructor	
   public Date(int dd,int mm,int yy) //local-instance
   {
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
   }

   //copy(parameterised) constructor	 
   public Date(Date d)
   {
	//state of d shouls be assigned to this
	this.dd = d.dd;
	this.mm = d.mm;
	this.yy = d.yy;
   }	

   //member methods
   public void display()
   {
	System.out.println(dd+"/"+mm+"/"+yy);  //concatenation;string
   }  

   public void display(char ch)
   {
        //System.out.println(dd+ch+mm+ch+yy);  //addition
	System.out.println(dd+""+ch+mm+""+ch+yy);  //conatenation	
   }
}
