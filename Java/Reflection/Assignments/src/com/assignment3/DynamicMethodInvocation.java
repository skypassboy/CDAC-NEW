package com.assignment3;

import java.lang.reflect.Method;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
        try {
            // Accept the fully qualified class name from the user
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.print("Enter the fully qualified class name: ");
            String className = scanner.nextLine();

            // Accept the method name to be invoked
            System.out.print("Enter the method name to invoke: ");
            String methodName = scanner.nextLine();

            // Load the class using reflection
            Class<?> dynamicClass = Class.forName(className);

            // Create an instance of the class using the default constructor
            Object dynamicObject = dynamicClass.newInstance();

            // Find the method to invoke
            Method method = dynamicClass.getMethod(methodName);

            // Invoke the method on the object
            Object result = method.invoke(dynamicObject);

            // Display the outcome of the method
            System.out.println("Outcome of the method: " + result);

            // Close the scanner
            scanner.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        } catch (NoSuchMethodException e) {
            System.err.println("Method not found: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error invoking the method: " + e.getMessage());
        }
    }
}

