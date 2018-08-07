package hw2;

import java.util.Scanner;

public class lielaksMazaksVienads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet veselu skaitli!");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Skaitlis ir negatīvs");
        } else if (num == 0) {
            System.out.println("Skaitlis ir nulle");
        } else
            System.out.println("Skaitlis ir pozitīvs");

    }
}
