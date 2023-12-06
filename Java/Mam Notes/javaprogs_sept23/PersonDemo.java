public class PersonDemo
{
   public static void main(String [] args)
   {
	Person p1 = new Person();
	p1.display();

	/*Date bdate = new Date(12,12,2000);
	Person p2 = new Person("bbbb",bdate); */

	Person p2 = new Person("Bakul",12,12,1999);
	p2.display();

	//System.out.println(p2.name);   //name is private
	System.out.println(p2.getName());   //getName is public
   }
}