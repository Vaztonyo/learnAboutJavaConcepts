package hello.xhosa;

import java.util.Scanner;

public class SayHello{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nNceda Faka igama lakho: \n");
        String name = scan.nextLine();

        System.out.println("\nMolo, " + name + "!\n");

        System.out.println("Faka yakho iminyaka: \n");
        int age = scan.nextInt();

        System.out.println("Igama: " + name + " Ubudala: " + age);

        scan.close();
    }
}