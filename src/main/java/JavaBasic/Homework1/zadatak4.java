package JavaBasic.Homework1;

import java.util.Scanner;

public class zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Proverite koliko uneti mesec u godini ima dana!");

        System.out.println("Unesite mesec u godini u formatu 1 do 12:");
        int y = sc.nextInt();
        int x;

        if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
            System.out.println("Broj dana u mesecu je 31");
        } else if (y == 4 || y == 6 || y == 9 || y == 11) {
            System.out.println("Broj dana u mesecu je 30");
        }

        if (y == 2) {
            System.out.println("Unesite godinu:");
            x = sc.nextInt();
            if ((x % 4 == 0) && (x % 400 == 0 || x % 100 != 0)) {
                System.out.println("Broj dana u mesecu je 29");
            } else {
                System.out.println("Broj dana u mesecu je 28");
            }
        }
    }
}
