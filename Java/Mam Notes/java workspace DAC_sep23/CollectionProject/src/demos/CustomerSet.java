package demos;

import java.util.*;

import entities.Customer;

public class CustomerSet {

	public static void main(String[] args) {
		Set<Customer> custs = new HashSet<>();
		custs.add(new Customer(10,"xxx","pune"));
		custs.add(new Customer(20,"ttt","mumbai"));
		custs.add(new Customer(12,"sss","pune"));
		custs.add(new Customer(31,"nnn","pune"));
		custs.add(new Customer(56,"kkk","delhi"));
		custs.add(new Customer(78,"lll","pune"));
		custs.add(new Customer(32,"ppp","mumbai"));
		custs.add(new Customer(10,"qqq","pune"));
		custs.add(new Customer(45,"rrr","bangalore"));
		custs.add(new Customer(98,"vvv","pune"));
		custs.add(new Customer(19,"jjj","delhi"));
		custs.add(new Customer(62,"ccc","pune"));
		custs.add(new Customer(32,"ppp","nashik"));
		
		for(Customer c  : custs)
			System.out.println(c);
		
		System.out.println("No of elements : "+custs.size());
		
		

		

	}

}
