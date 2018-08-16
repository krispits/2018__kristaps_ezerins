package hw3For;

import java.util.Scanner;

public class SkaitluSumma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet skaitļus: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;

        for (int i = num1; i<=num2; i++){
            sum=sum+i;
        }
        System.out.println(sum);




    }


}
