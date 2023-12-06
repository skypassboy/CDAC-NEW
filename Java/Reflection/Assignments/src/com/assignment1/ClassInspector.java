package com.assignment1;

import java.lang.reflect.*;

public class ClassInspector {
    public static void main(String[] args) {
        // Prompt the user to enter a fully qualified class name
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter a fully qualified class name: ");
        String className = scanner.nextLine();
        scanner.close();

        try {
            // Load the class
            Class<?> clazz = Class.forName(className);

            // Display package information
            Package classPackage = clazz.getPackage();
            if (classPackage != null) {
                System.out.println("Package: " + classPackage.getName());
            } else {
                System.out.println("Package: (default)");
            }

            // Display class modifiers (final, abstract, etc.)
            int modifiers = clazz.getModifiers();
            if (Modifier.isFinal(modifiers)) {
                System.out.println("Class is final");
            } else if (Modifier.isAbstract(modifiers)) {
                System.out.println("Class is abstract");
            }

            // Display super class
            Class<?> superClass = clazz.getSuperclass();
            if (superClass != null) {
                System.out.println("Superclass: " + superClass.getName());
            }

            // Display implemented interfaces
            Class<?>[] interfaces = clazz.getInterfaces();
            if (interfaces.length > 0) {
                System.out.print("Implemented Interfaces: ");
                for (Class<?> intf : interfaces) {
                    System.out.print(intf.getName() + " ");
                }
                System.out.println();
            }

            // Display constructors
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            System.out.println("Constructors:");
            for (Constructor<?> constructor : constructors) {
                System.out.println("  " + constructor.toString());
            }

            // Display methods
            Method[] methods = clazz.getDeclaredMethods();
            System.out.println("Methods:");
            for (Method method : methods) {
                System.out.println("  " + method.toString());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + className);
        }
    }
}

