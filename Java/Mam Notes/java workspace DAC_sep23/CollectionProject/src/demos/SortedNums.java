package demos;
import java.util.Set;
import java.util.TreeSet;

public class SortedNums {
	public static void main(String[] args) {
		Set<Integer> nums = new TreeSet<>((Integer n1,Integer n2)->{
				int sum1=0,sum2=0;
				int diff=0;
				int temp1=n1,temp2=n2;
				while(n1!=0) {
					int mod=n1%10;
					sum1+=mod;
					n1=n1/10;
				}
				while(n2!=0) {
					int mod=n2%10;
					sum2+=mod;
					n2=n2/10;
				}
				diff=sum1-sum2;
				if(diff==0) {
					diff=temp1-temp2;
				}
				return diff;
		} );
		
		nums.add(14);
		nums.add(30);
		nums.add(21);
		nums.add(56);
		nums.add(20);
		nums.add(11);
		
		System.out.println(nums);

	}

}
