package Homework1;

import java.util.Scanner;

public class Houses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        if (a + c <= e && b + d <= f) {
            System.out.println("Дома помещаются");
        } else if (a <= e && c <= e && b + d <= f) {
            System.out.println("Дома помещаются");
        } else if (b <= f && d <= f && a + c <= e) {
            System.out.println("Дома помещаются");
        } else {
            System.out.println("Дома не помещаются");
        }
    }
}
