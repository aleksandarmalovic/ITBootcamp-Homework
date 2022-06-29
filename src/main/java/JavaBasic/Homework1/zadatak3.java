package JavaBasic.Homework1;

import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite godinu da biste proverili da li je ona prestupna:");

        int x = sc.nextInt();

        if ((x % 4 == 0) && (x % 400 == 0 || x % 100 !=0 )) {
            System.out.println("Prestupna godina");
        }
        else {
            System.out.println("Godina nije prestupna");
        }

    }
}
