package hw2;

import java.util.Scanner;

// šeit ir arī loģikas kļūda
public class BiggestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first nu4mber: ");
        // kļūda vārdā nu4mber - jābūt number.
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");

        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");

        int thirdNumber = scanner.nextInt();

        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {

            System.out.println("All numbers are equals!");

        } else if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {

            System.out.println("The first number is the greatest!");

        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {

            System.out.println("The second number is the greatest!");

        } else {

            System.out.println("The third number is the greatest!");

        }

    }

}
