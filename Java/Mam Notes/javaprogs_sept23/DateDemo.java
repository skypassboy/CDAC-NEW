public class DateDemo
{
   public static void main(String [] args)
   {
	Date d1;  //reference variable
                   //local variable of main
        
        d1 = new Date();  //allocate memory
                          //call appropriate constructor
        d1.display();    //has got it's own data 0/0/0
	//d1.display(12,2,1999);

        d1.display('-');   //0-0-0

	Date d2;
	d2 = new Date(12,12,2000);
	d2.display();

	Date d3 = new Date(d2);
	d3.display();
   }
}