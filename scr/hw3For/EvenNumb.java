package hw3For;

import java.util.Scanner;

public class EvenNumb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselus skaitļus no līdz:");

        int num1 = scanner.nextInt();   //labāk lietot precīzākus nosaukumus,
                                        // piemēram, intervalFrom
        int num2 = scanner.nextInt();


        for (int i = num1; i <= num2; i++){
           if (i%2 == 0){
            System.out.println(i); }   //izmantojam taustinu kombinaciju ctrl+alt+l - palīdzēs sakārtot tekstu
        }
    }
}
