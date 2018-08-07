package hw1;

import java.util.Scanner;

public class ievaditSkatliSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        int num1 = scanner.nextInt();
        System.out.println("Ievadiet otro skaitli");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.println("Ievadīto skaitļu summa ir " + num3);

    }
}
