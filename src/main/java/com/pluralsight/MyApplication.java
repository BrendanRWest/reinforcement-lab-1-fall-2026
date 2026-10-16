package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = nameInput(scan);
        int age = ageInput(scan);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        canVote(age);
        message(name, age);
        isAlice(name);
        isBobAnd21(name, age);

        scan.close();
    }

    public static void message(String name, int age) {
        System.out.println(name + ", you are the coolest " + age + " year old ever!");
    }

    public static String nameInput(Scanner scan){
        System.out.print("Hello, please enter your name: ");
        return scan.nextLine();
    }

    public static int ageInput(Scanner scan){
        System.out.print("Please enter your age: ");
        return scan.nextInt();
    }
    public static void canVote(int age) {
        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are not old enough to vote.");
        }
    }

    public static void isAlice(String name) {
        if (name.equalsIgnoreCase("Alice")){
            System.out.println("Oh my gosh, hey Alice!!!");
        } else {
            System.out.println("Do you know where Alice is?");
        }
    }

    public static void isBobAnd21(String name, int age) {
        if(name.equalsIgnoreCase("bob") && age>=21){
            System.out.printf("Okay %s, you can drink!%n", name);
        } else {
            System.out.printf("No %s, don't even think about drinking!%n", name);
        }
    }
}
