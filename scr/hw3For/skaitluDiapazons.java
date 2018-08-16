package hw3For;

import java.util.Scanner;

//klašu nosaukumi ir jāraksta ar lielo burtu un angļu valodā
public class skaitluDiapazons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet pirmo skaitli:");
        int num1 = scanner.nextInt(); //mainīgo nosaukumiem jābūt izteiksmīgākiem
        System.out.println("ievadiet otro skaitli:");
        int num2 = scanner.nextInt();

        for (int i = num1 ; i <= num2; i++ ){
        System.out.println(i);
        }
    }
}
