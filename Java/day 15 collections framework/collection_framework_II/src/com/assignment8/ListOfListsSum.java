package com.assignment8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfListsSum{
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Accept data from the user line by line until "stop" is entered
        while (true) {
            System.out.println("Enter a line of space-separated integers or 'stop' to finish:");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }

            List<Integer> integers = new ArrayList<>();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                try {
                    int num = Integer.parseInt(token);
                    integers.add(num);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid input. Please enter integers separated by spaces.");
                }
            }

            listOfLists.add(integers);
        }

        
        
        scanner.close();
        
        int maxSum = Integer.MIN_VALUE;
        int indexOfMaxSumList = -1;

        for (int i = 0; i < listOfLists.size(); i++) {
            List<Integer> list = listOfLists.get(i);
            int sum = 0;

            for (int num : list) {
                sum += num;
            }

            if (sum > maxSum) {
                maxSum = sum;
                indexOfMaxSumList = i;
            }
        }
//        indexOfMaxSumList
        System.out.println("indexOfMaxSumList "+ indexOfMaxSumList);
        // Display the list with the maximum sum
        if (indexOfMaxSumList >= 0) {
            System.out.println("List with the highest sum: " + listOfLists.get(indexOfMaxSumList));
            System.out.println("Sum of the highest sum list: " + maxSum);
        } else {
            System.out.println("No valid lists to display.");
        }

        // Calculate the total sum of all elements in all lists
        int totalSum = 0;
        for (List<Integer> list : listOfLists) {
            for (int num : list) {
                totalSum += num;
            }
        }

        System.out.println("Total sum of all elements in all lists: " + totalSum);
    
        
    }
}