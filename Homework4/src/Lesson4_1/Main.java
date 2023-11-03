package Lesson4_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        calculator(pervoeChislo(), deistvie(), vtoroeChislo());

    }

    static int pervoeChislo() {

        while (true) {
            System.out.println("Введите первое число: ");
            Scanner sc = new Scanner(System.in);
            try {
                int x = sc.nextInt();
                return x;
            } catch (InputMismatchException x) {
                System.out.println("Вы ввели не число");
            }
        }
    }

    static int vtoroeChislo() {

        while (true) {

            try {

                System.out.println("Введите второе число: ");
                Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                return x;

            } catch (InputMismatchException x) {
                System.out.println("Вы ввели не число");
            }
        }
    }

    static char deistvie() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите действие (+, -, /, *): ");
            char x = sc.next().charAt(0);
            if (x == '+' || x == '-' || x == '*' || x == '/') {
                return x;
            } else {
                System.out.println("Вы ввели неверное действие.");
            }
        }
    }

    static void calculator(int x1, char z, int x2) {

        if (z == '+') {
            System.out.println("Сумма чисел: " + (x1 + x2));
        } else if (z == '-') {
            System.out.println("Разность чисел: " + (x1 - x2));
        } else if (z == '*') {
            System.out.println("Произведение чисел: " + (x1 * x2));
        } else if (z == '/') {
            while (true) {
                if (x2 == 0) {
                    System.out.println("На ноль делить нельзя, введите другое число");
                    x2 = vtoroeChislo();
                } else {
                    System.out.println("Частное чисел: " + (x1 / x2));
                    break;
                }
            }
        }
    }
}
