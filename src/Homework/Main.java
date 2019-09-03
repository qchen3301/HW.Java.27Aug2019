package Homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello World from the Main Class!");


        //UserMainCode thisNewObject = new UserMainCode();
        int countMyVars = UserMainCode.testVowels("abcdefghh");
        System.out.println(countMyVars);
    }
}
