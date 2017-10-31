package Homework1;

import java.util.Scanner;

// Не знаю как вернуть значение D в main
public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = 0;
        discriminant(a, b, c, D);
        isPositive(a, b, D);
        isZero(a, b, D);
    }

    private static double discriminant(double a, double b, double c, double D) {
        D = ((b * b) - 4 * (a * c));
        return D;
    }

    private static void isPositive(double a, double b, double D) {
        if (D > 0) {
            double x1, x2;
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }

    private static void isZero(double a, double b, double D) {
        if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }

}
