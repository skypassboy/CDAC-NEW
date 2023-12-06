package demos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo {

	public static void main(String[] args) 
	{
		Map<Integer, String> courses = new HashMap<>();
		courses.put(20, "PG-DAC");
		courses.put(25, "PG-DBDA");
		courses.put(30, "PG-DAI");
		courses.put(35, "PG-DMC");
		courses.put(40, "PG-DITISS");
		courses.put(45, "PG-Infra");
		courses.put(null, null);
		courses.put(null, "XXXX");
		courses.put(55, null);
		courses.put(60, null);
		
		
		System.out.println(courses);  //toString
		
		/*courses.forEach(new BiConsumer<Integer, String>() {
			@Override
			public void accept(Integer t, String u) {
				System.out.println(t+" : "+u);				
			}
		});*/
		
		courses.forEach((Integer t, String u)->{System.out.println(t+" : "+u);});
		
		System.out.println(courses.get(35)); //get the value for key
		System.out.println(courses.containsKey(35));
		
		courses.remove(25);
		courses.replace(20, "PG-FFFFF");
		System.out.println("*****************");
		
		courses.forEach((Integer t, String u)->{System.out.println(t+" : "+u);});
		
		
		System.out.println("convert map to set........");
		Set<Entry<Integer, String>> set = courses.entrySet();
		
		Iterator<Entry<Integer, String>> itobj = set.iterator();
		while(itobj.hasNext())
		{
			Entry<Integer, String> e = itobj.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		System.out.println("********************");
		for(Entry<Integer, String> e  : set)
			System.out.println(e.getKey()+" : "+e.getValue());
		
		
		
		
		
		
	}

}
