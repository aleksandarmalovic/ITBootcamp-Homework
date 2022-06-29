package JavaBasic.Homework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj: ");

        int x = sc.nextInt();
        int sum = x;

        if ( x!= 0){
            while ( x != 0) {
                System.out.print("Zbir je: "+ sum + " , " + "Unesite sledeci broj ili 0 da izadjete iz programa: ");
                x = sc.nextInt();
                sum += x;
            }
        }
        else {
            System.out.println("Resenje je 0.");
        }
        System.out.println("Ukupan zbir je: " +sum);
    }
}
