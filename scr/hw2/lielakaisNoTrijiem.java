package hw2;

import java.util.Scanner;

public class lielakaisNoTrijiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli A: ");
        int num1 = scanner.nextInt();
        System.out.println("Ievadiet skaitli B: ");
        int num2 = scanner.nextInt();
        System.out.println("ievadiet skaitli C: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("lielākais ievadītais skaitlis ir " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("lielākais ievadītais skaitlis ir " + num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("lielākais ievadītais skaitlis ir " + num3);
        } else {
            System.out.println("A == B == С");
        }
    }
}
