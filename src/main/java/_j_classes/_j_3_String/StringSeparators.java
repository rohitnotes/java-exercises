package _j_classes._j_3_String;

import java.util.Scanner;

public class StringSeparators {

    public static void colonsInString(String string) {
        String[] stringArray = string.split(":");
        System.out.println("Strings array's length: " + stringArray.length);
        String newString = "";
        for (int i = 0; i < stringArray.length; i++) {
            newString = newString.concat(stringArray[i] + " ");
        }
        System.out.println(newString.trim());
    }

    public int dotsInString() {
        intro();
        String string = scannedString();
        int counter = string.length() - string.replace(".", "").length();
        System.out.println("Amount of dots in given sentence: "+counter);
        return counter;
    }

    public static void intro() {
        System.out.println("Please enter a random sentence: ");
    }

    public String scannedString() {
        Scanner scan = new Scanner(System.in);
        String inputLine = scan.nextLine();
        return inputLine;
    }
}