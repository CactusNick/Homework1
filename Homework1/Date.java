package Homework1;

import java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        if (day == 30 && month < 12) {
            day = 1;
            month += 1;
        }
        if (day == 30 && month == 12) {
            day = 1;
            month = 1;
            year += 1;
        }
        time(day, month, year);
    }

    private static void time(int day, int month, int year) {
        System.out.println(day + "." + month + "." + year);
    }
}

