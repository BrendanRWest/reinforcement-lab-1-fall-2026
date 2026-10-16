package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;

        System.out.print("Hello, please enter your name: ");
        name = scan.nextLine();

        System.out.print("Please enter your age: ");
        age = scan.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are not old enough to vote.");
        }
        message(name, age);
        scan.close();
    }

    public static void message(String name, int age) {
        System.out.println(name + ", you are the coolest " + age + " year old ever!");
    }
}
