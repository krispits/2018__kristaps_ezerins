package hw2;

import java.util.Scanner;

//klašu nosaukumi rakstāmi angļu valodā un ar lielo burtu
public class lielakaisNoDiviem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet skaitli A");
        int num1 = scanner.nextInt();  //varbūt labāk "numberA" nosaukt
        System.out.println("ievadiet skaitli B");
        int num2 = scanner.nextInt(); //varbūt labāk "numberB" nosaukt
        if (num1 == num2) {
            System.out.println("A == B");
        } else if (num1 > num2) {
            System.out.println(num1);
        } else   // ja lietojam "{" tad lietojam tās visur
            System.out.println("Lielākais skaitlis ir " + num2);

        //programma izvadīs dažādus paziņojumus,
        // teksts "Lielākais skaitlis ir " būs tikai vienā gadījumā

    }
}
