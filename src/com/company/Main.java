package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        // write your code here
        out.println("Enter a message to encode or decode:");

        String message;
        try (Scanner scan = new Scanner(in)) {
            message = scan.nextLine();
        }
        StringBuilder out = new StringBuilder();

        int messageLen;
        messageLen = message.length();

        char key = 13;
        char curChar;

        for (int x = 0; x < messageLen; x++) {
            curChar = message.charAt(x);

            if (curChar >= 'A' && curChar <= 'Z') {
                curChar += key;
                if (curChar > 'Z') curChar -= 26;
            } else if (curChar >= 'a' && curChar <= 'z') {
                curChar += key;
                if (curChar > 'z') curChar -= 26;
            }

            out.append(curChar);
        }

        System.out.println();
        System.out.println(out);

    }
}
