package hw1;

import java.util.Scanner;

//klašu nosaukumi rakstāmi angļu valodā un ar lielo burtu
public class ievaditSkatliSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        int num1 = scanner.nextInt();
        System.out.println("Ievadiet otro skaitli");
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;  //num3 - švaks nosaukums - drīzāk "sum"
        System.out.println("Ievadīto skaitļu summa ir " + num3);

    }
}
