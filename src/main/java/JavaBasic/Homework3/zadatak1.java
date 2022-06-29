package JavaBasic.Homework3;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dm = 1; // dan u mesecu
        System.out.print("Unesite godinu: ");
        int x = sc.nextInt();
        while (x < 0) {
            System.out.println("Racunamo samo za datume posle 1900.godine. Probajte ponovo: ");
        }

        System.out.print("Unesite mesec (od 1 do 12): ");
        int y = sc.nextInt();  //y=mesec u godini
        while ((y > 12) || (y < 1)) {
            System.out.print("Uneli ste nepostojeci mesec. Probajte ponovo: ");
            y = sc.nextInt();
        }

        if (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12) {
            System.out.print("Unesite dan (od 1 do 31): ");
            dm = sc.nextInt();
            while ((dm > 31) || (dm < 1)) {
                System.out.print("Uneli ste nepostojeci dan. Probajte ponovo: ");
                dm = sc.nextInt();
            }
            System.out.println();

        } else if (y == 4 || y == 6 || y == 9 || y == 11) {
            System.out.print("Unesite dan (od 1 do 30): ");
            dm = sc.nextInt();
            while ((dm > 30) || (dm < 1)) {
                System.out.print("Uneli ste nepostojeci dan. Probajte ponovo: ");
                dm = sc.nextInt();
            }
            System.out.println();
        }


        if (y == 2) {
            if ((x % 4 == 0) && (x % 400 == 0 || x % 100 != 0)) {
                System.out.print("Unesite dan (od 1 do 29): ");
                dm = sc.nextInt();
                while ((dm > 29) || (dm < 1)) {
                    System.out.print("Uneli ste nepostojeci dan. Probajte ponovo: ");
                    dm = sc.nextInt();
                }
            } else {
                System.out.print("Unesite dan (od 1 do 28): ");
                dm = sc.nextInt();
                while ((dm > 28) || (dm < 1)) {
                    System.out.print("Uneli ste nepostojeci dan. Probajte ponovo: ");
                    dm = sc.nextInt();
                }
            }
        }

        int[] prestupnaGodina = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] godina = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        if ((x % 4 == 0) && (x % 400 == 0 || x % 100 != 0)) {
            for (int i = 0; i < y; i++) {
                sum += prestupnaGodina[i];
            }
            sum = sum - prestupnaGodina[y - 1] + dm;

        } else {
            for (int i = 0; i < y; i++) {
                sum += godina[i];
            }
            sum = sum - godina[y - 1] + dm;
        }
        System.out.println("Redni broj dana u godini je: " + sum);
    }
}





