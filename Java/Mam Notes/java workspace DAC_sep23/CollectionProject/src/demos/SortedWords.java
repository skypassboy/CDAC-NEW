package demos;

import java.util.Set;
import java.util.TreeSet;

public class SortedWords {

	public static void main(String[] args) 
	{
		Set<String> words = new TreeSet<>();
		words.add("welcome");
		words.add("hi");
		words.add("object");
		words.add("html");
		words.add("jquery");
		words.add("welcome");
		words.add("bootstrap");
		
		System.out.println(words);
		
		Set<Integer> nums = new TreeSet<>();
		nums.add(45);
		nums.add(34);
		nums.add(23);
		nums.add(67);
		nums.add(12);
		nums.add(65);
		
		System.out.println(nums);
		

	}

}
