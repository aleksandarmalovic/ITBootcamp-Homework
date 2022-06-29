package JavaBasic.Homework2;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < (n - 1); i++) {
            if ( i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        if (n % 2 == 0 && n > 1) {
            System.out.println(n);
        }
        if ((n - 1) % 2 == 0 && n > 1){
            System.out.println((n-1));
        }
    }
}
