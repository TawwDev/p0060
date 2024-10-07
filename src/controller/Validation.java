package controller;

import java.util.Scanner;
import model.Wallet;

public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public int getInt(String msg, int min, int max) {
        int n;
        while (true) {
            System.out.print(msg);
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                }
            } catch (NumberFormatException ne) {
                System.out.println("Money need a positive number and in the range: " + min + " to " + max);
            }
        }
    }

}
