package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       // System.out.printf("%s and welcome!", "hello");
        System.out.println("hello and welcome!");


        System.out.println("Please input your number 1");

        int number1 = Integer.parseInt(scanner.nextLine());


        System.out.println("Please input your number 2");

        int number2 = Integer.parseInt(scanner.nextLine());

        System.out.println("your number is: " + (number1 + number2));
    }
}