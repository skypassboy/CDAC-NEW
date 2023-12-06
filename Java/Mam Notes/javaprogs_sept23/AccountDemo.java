public class AccountDemo
{
   public static void main(String [] args)
   {
	Account a1 = new Account(1234, 10000.0);
	a1.display();

        //recommended way
	Account.updateRate(4.57f);
	//not expected as updateRate is static
	//a1.updateRate(4.57f);	
	a1.display();
   }
}