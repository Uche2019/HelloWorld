package java2022;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner keyboard= new Scanner(System.in);
        System.out.print("What is your name?");
        Scanner keyboard= new Scanner(System.in);
        String input = keyboard.nextLine();
        System.out.print("Hello," + input);
    }
}

