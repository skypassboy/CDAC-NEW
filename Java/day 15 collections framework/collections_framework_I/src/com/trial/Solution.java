package com.trial;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int removeDuplicates(int[] nums) {
        

//
//       List<Integer> ll = new ArrayList<Integer>();
//
//        for(int i=0;i<nums.length;i++){
//            if(!ll.contains(nums[i])){
//                ll.add(nums[i]);
//            }
//        }
//
//        int [] arr = new  int [ll.size()];
//
//        int size=0;
//        for(int i : ll){
//            arr[size]=i;
//            size++;
//        }
//
//        return arr.length;

    	
    	int insertIndex = 1;

        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[insertIndex] = nums[i];

                insertIndex++;
            }
        }

        return insertIndex;

    }
    
    public static void main(String[] args) {
    	
    	int arr[] = {1,1,2,3,3,4};
    	
    	System.out.println(removeDuplicates(arr));
    	
    	
    }
    
}
