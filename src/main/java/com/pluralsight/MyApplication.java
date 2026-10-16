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

        System.out.printf("Name: %s%n", name);
        System.out.printf("Age: %d", age);

        scan.close();

    }
}
