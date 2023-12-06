class Account
{
   //non-static data members
   private int accno;
   private double balance;

   //static data member
   private static float int_rate;

   static 
   {
	int_rate = 4.3f;
   }			

   public Account()		 
   {
	//accno=0;
	//balnce=0.0;
   }
   public Account(int accno,double balance)
   {
	this.accno = accno;
	this.balance = balance;
   }

   //non-static-instance method
   public double calInterest() {
	return (balance*int_rate/100);
   }
	
   public void display()
   {
	System.out.println("Accno : "+accno);
        System.out.println("Balance without interest : "+balance);
	System.out.println("Balance with interest : "+(balance+calInterest() ));
   }

   //static - can access only static , can not refer this
   public static void updateRate(float newRate)
   {
	//System.out.println("Balance without interest : "+balance);
	int_rate = newRate;
   }		
   
}





