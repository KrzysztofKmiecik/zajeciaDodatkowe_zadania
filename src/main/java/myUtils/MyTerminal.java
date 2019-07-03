package myUtils;

import java.util.Scanner;

public class MyTerminal {
    public static void PrintInfo(String text) {
        System.out.println(text);
    }

    public static int getInt(String text) {
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

}
