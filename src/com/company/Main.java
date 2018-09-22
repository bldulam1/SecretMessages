package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // Ask for String user input (message)
        out.println("Enter a message to encode or decode:");

        Scanner scan = new Scanner(in);
        String message = scan.nextLine();

        // Ask for Integer user input (key)
        out.print("Enter a secret key (-26 to 26):");
        int key = Integer.parseInt(scan.nextLine());

        // Check if input is valid
        while (key > 26 || key < -26) {
            out.println("Invalid input.");
            out.print("Enter a secret key (-26 to 26):");
            key = Integer.parseInt(scan.nextLine());
        }


        StringBuilder out = new StringBuilder();

        int messageLen = message.length();

        char curChar;
        for (int x = 0; x < messageLen; x++) {
            curChar = message.charAt(x);

            if (curChar >= 'A' && curChar <= 'Z') {
                curChar += (char) key;
                if (curChar > 'Z') curChar -= 26;
                else if (curChar < 'A') curChar += 26;

            } else if (curChar >= 'a' && curChar <= 'z') {
                curChar += (char) key;
                if (curChar > 'z') curChar -= 26;
                else if (curChar < 'a') curChar += 26;
            }

            out.append(curChar);
        }

        System.out.println();
        System.out.println(out);
        //
    }
}