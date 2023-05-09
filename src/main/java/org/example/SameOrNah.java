package org.example;
import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word1 = scan.nextLine();

        System.out.println("Enter another word:");
        String word2 = scan.nextLine();

        if (word1.equals(word2)) {
            System.out.println("These words are the same");
        }else {
            System.out.println("These words are different");
        }
    }
}