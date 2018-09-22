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

        for (int x = 0; x < messageLen; x++)
            out.append((char) (message.charAt(x) + 13));

        System.out.println();
        System.out.println(out);

    }
}
