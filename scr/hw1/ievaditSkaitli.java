package hw1;

import java.util.Scanner;

//klašu nosaukumi rakstāmi angļu valodā un ar lielo burtu
public class ievaditSkaitli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli:");
        int number = scanner.nextInt();
        System.out.println("Jūsu ievadītais skaitlis: " + number);
    }
}


