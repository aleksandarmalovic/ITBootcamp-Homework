package JavaBasic.Homework2;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n <= 0){
            System.out.print("Morate uneti prirodan broj! Unesite prirodan broj: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n ; i++) {
            if (( i % 5 == 0) && ( i % 3 == 0)){
                System.out.println("FizzBuzz");
            } else if ( i % 5 == 0) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0) {
                System.out.println("Fizz");
            }
            else {
                System.out.println(i);
        }
        }

    }
}
