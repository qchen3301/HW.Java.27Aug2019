package Homework;
import java.util.Scanner;


public class UserMainCode {

    static Scanner userInput = new Scanner(System.in);
    static int testVowels(String userStringParam) {
        userStringParam = userInput.nextLine();
//        char testChar;
        int vowelCounter = 0;

        for (int i = 0; i < userStringParam.length(); i++) {
//            testChar = userStringParam.charAt(i);
            if (userStringParam.charAt(i) == 'a') {
                vowelCounter++;
            }
            else if (userStringParam.charAt(i) == 'e') {
                vowelCounter++;
            }
            else if (userStringParam.charAt(i) == 'i') {
                vowelCounter++;
            }
            else if (userStringParam.charAt(i) == 'o') {
                vowelCounter++;
            }
            else if (userStringParam.charAt(i) == 'u') {
                vowelCounter++;
            }
            else {
                vowelCounter = 0;
            }

        }
        return vowelCounter;
    }
}


