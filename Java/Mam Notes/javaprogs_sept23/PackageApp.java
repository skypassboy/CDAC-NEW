import office.staff.Trainer;
import office.staff.Admin;
//import office.staff.*;
public class PackageApp
{
    public static void main(String []args)
    {
	//office.staff.Trainer t = new office.staff.Trainer();
	Trainer t = new Trainer();
	t.display();

	Admin a = new Admin();
	a.display();
	
    }			
}
