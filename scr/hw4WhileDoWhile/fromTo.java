package hw4WhileDoWhile;

import java.util.Scanner;

public class fromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitļus: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        while(num1<=num2) {
            System.out.println(num1);
            num1++;
        }
    }
}
