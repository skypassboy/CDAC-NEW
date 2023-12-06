package com.assignment2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarOperations {
    public static void main(String[] args) {
        // Display current date and time
        Date currentDate = new Date();
        System.out.println("a. Current Date and Time: " + currentDate);

        // Display the week of the year from the current date
        Calendar calendar = Calendar.getInstance();
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("b. Week of the Year: " + weekOfYear);

        // Display current date and time with custom format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm:ss a");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("c. Formatted Date: " + formattedDate);

        // Add 3 years to the current date and display in SHORT format
        calendar.add(Calendar.YEAR, 3);
        Date newDate = calendar.getTime();
        SimpleDateFormat shortDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT);
        System.out.println("d. Date after adding 3 years: " + shortDateFormat.format(newDate));

        // Extract the year and check if it's a leap year
        calendar.setTime(currentDate);
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println("e. Current Year: " + currentYear);
        boolean isLeapYear = (currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0));
        System.out.println("   Is Leap Year? " + isLeapYear);

        // Accept a date from the user and convert it to Date with a specified format
        Scanner scanner = new Scanner(System.in);
        System.out.print("f. Enter a date (e.g., 03 Dec 2021): ");
        String userDate = scanner.nextLine();
        SimpleDateFormat userDateFormat = new SimpleDateFormat("dd MMM yyyy");
        try {
            Date parsedDate = userDateFormat.parse(userDate);
            System.out.println("   Parsed Date: " + parsedDate);
        } catch (Exception e) {
            System.out.println("   Error parsing the date. Please use the format 'dd MMM yyyy'.");
        }
    }
}
