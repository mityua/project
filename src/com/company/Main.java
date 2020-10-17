package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        main.revertLetters(input);
        String condition;
        while (true) {
            System.out.println("Do you want to continue [y/n]?");
            condition = scanner.nextLine();
            if (condition.startsWith("y")) {
                main.revertLetters(input);
            } else {
                break;
            }
        }
        System.out.println("Finish");
    }
    private void revertLetters(String input1) {
        char[] inputLetters1 = input1.toCharArray();
        char[] outputLetters1 = new char[inputLetters1.length];
        for (int j = 0, i = inputLetters1.length - 1; i >= 0; j++, i--) {
            if (inputLetters1[i] == ' ') {
                outputLetters1[j] = '_';
            } else {
                outputLetters1[j] = inputLetters1[i];
            }
        }
        System.out.println(new String(outputLetters1));
    }
}