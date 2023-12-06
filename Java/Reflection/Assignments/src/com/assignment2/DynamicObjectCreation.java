package com.assignment2;

import java.lang.reflect.Constructor;

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            // Accept the fully qualified class name from the user
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter the fully qualified class name: ");
            String className = scanner.nextLine();
            
            // Load the class using reflection
            Class<?> dynamicClass = Class.forName(className);

            // Choose a constructor (you can choose a constructor that matches your needs)
            // In this example, we'll use the default constructor.
            Constructor<?> constructor = dynamicClass.getConstructor();

            // Create an instance of the class using the chosen constructor
            Object dynamicObject = constructor.newInstance();

            // Display the created object
            System.out.println("Dynamic object created: " + dynamicObject);

            // Close the scanner
            scanner.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.err.println("Constructor not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error creating the object: " + e.getMessage());
        }
    }
}

