package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        revertLetters(scanner);

        String condition;
        while (true) {
            System.out.println("Do you want to continue [y/n]?");
            condition = scanner.nextLine();
            if (condition.startsWith("y")) {
                revertLetters(scanner);
            } else {
                break;
            }
        }
        System.out.println("Finish");
    }

    private static void revertLetters(Scanner scanner) {
        String input1 = scanner.nextLine();
        char[] inputLetters1 = input1.toCharArray();
        char[] outputLetters1 = new char[inputLetters1.length];
        for (int j = 0, i = inputLetters1.length - 1; i >= 0; j++, i--) {
            outputLetters1[j] = inputLetters1[i];
        }
        System.out.println(new String(outputLetters1));
    }
}