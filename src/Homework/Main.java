package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World from the Main Class!");
        System.out.println("Enter in your string to check if all vowels are present");
        String countMyVowels = input.next();
        int returnMyVowels = UserMainCode.testVowels(countMyVowels);
        System.out.println(returnMyVowels);
    }
}
