package cz.itnetwork.Empowerment;

import java.util.Scanner;

public class Empowerment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Empowerment");
        System.out.println("==========");
        System.out.println("Enter the base of the power: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the exponent: ");
        int n = Integer.parseInt(sc.nextLine());

        int result = a;
        for (int i = 0; i < (n - 1); i++) {
            result = result * a;
        }

        System.out.printf("Result: %d", result);
        System.out.println();
        System.out.println("Thanks for using");
    }
}
