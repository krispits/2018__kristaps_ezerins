package hw2;

import java.util.Scanner;

public class lielakaisNoDiviem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli A");
        int num1 = scanner.nextInt();
        System.out.println("ievadiet skaitli B");
        int num2 = scanner.nextInt();
        if (num1 == num2){
            System.out.println("A == B");
        } else if (num1 > num2){
            System.out.println(num1);
        } else
            System.out.println("Lielākais skaitlis ir " + num2);

    }
}
