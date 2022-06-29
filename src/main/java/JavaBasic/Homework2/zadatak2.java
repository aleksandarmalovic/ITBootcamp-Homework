package JavaBasic.Homework2;


import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Korisnik unosi: ");
        System.out.print(" ");

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        if ( n != m ) {
            for (int i = n; i <=m ; i++) {
                sum += i;
                if (i == n) {
                    System.out.print("(" + i + " + ");
                }
                else if (i > n && i <m) {
                    System.out.print(i + " + ");
                }
                else if (i == m){
                    System.out.println(m + ")");
                }
            }

            for (int i = m; i <=n ; i++) {
                sum += i;
                if (i == m) {
                    System.out.print("(" + i + " + ");
                }
                else if (i > m && i <n) {
                    System.out.print(i + " + ");
                }
                else if (i == n){
                    System.out.println(")" + n);
                }

            }
        }
        if ( n == m) {
            System.out.println("Vrednost je: "+ n);
        }
        else {
            System.out.println("Suma je: " + sum);
        }

    }

}
