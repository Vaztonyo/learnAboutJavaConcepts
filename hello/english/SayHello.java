package hello.english;

import java.util.Scanner;

public class SayHello{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPlease Enter your Name: \n");
        String name = scan.nextLine();

        System.out.println("\nHello, " + name + "!\n");

        System.out.println("Enter your age: \n");
        int age = scan.nextInt();

        System.out.println("Name: " + name + " Age: " + age);

        scan.close();
    }
}