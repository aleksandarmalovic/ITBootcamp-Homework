package JavaBasic.Homework3;

import java.util.Arrays;
import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite n-ti broj Fibonacijevog niza: ");

        int n = sc.nextInt();
        int[] fibonacijevNiz = new int[n];
        System.out.print("Fibonacijev niz do n-tog broja je: ");
        if ( n>=1 ) {
            fibonacijevNiz[0] = 0;
            System.out.print(fibonacijevNiz[0] + " ");
        }
        if ( n>=2 ) {
            fibonacijevNiz[1] = 1;
            System.out.print(fibonacijevNiz[1] + " ");
        }

        if (n >= 3) {
            for (int i = 2; i < fibonacijevNiz.length; i++) {
                fibonacijevNiz[i] = fibonacijevNiz[i - 1] + fibonacijevNiz[i - 2];
                System.out.print(fibonacijevNiz[i] + " ");
            }
        }
        System.out.println();
    }
}
