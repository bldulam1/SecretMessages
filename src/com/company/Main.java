package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter a message to encode or decode:");

        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();

        String out = "";

        for (int x = message.length() - 1; x >= 0; x--) {
            out += message.charAt(x);
        }

        System.out.println();
        System.out.println(out);

    }
}
