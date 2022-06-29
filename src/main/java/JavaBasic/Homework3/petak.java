package JavaBasic.Homework3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class petak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] figure = {"kraljica", "top", "konj", "lovac", "pesak"};

        System.out.print("Unesite broj figura prvog igraca: ");

        int i1 = sc.nextInt();
        sc.nextLine();
        String[] igrac1 = new String[i1];
        System.out.println("Unesite imena figura prvog igraca i posle svake figure pritisnite enter: ");
        for (int i = 0; i < igrac1.length; i++) {
            igrac1[i] = sc.nextLine();
            igrac1[i] = igrac1[i].toLowerCase();
            igrac1[i] = igrac1[i].trim();
        }
        //System.out.print(Arrays.toString(igrac1));
        System.out.println();
        System.out.print("Unesite broj figura drugog igraca: ");

        int i2 = sc.nextInt();
        sc.nextLine();
        String[] igrac2 = new String[i2];
        System.out.println("Unesite imena figura drugog igraca i posle svake figure pritisnite enter: ");
        for (int i = 0; i < igrac2.length; i++) {
            igrac2[i] = sc.nextLine();
            igrac2[i] = igrac2[i].toLowerCase();
            igrac2[i] = igrac2[i].trim();
        }
        //System.out.print(Arrays.toString(igrac2));

        int suma1 = 0;
        for (int i = 0; i < igrac1.length; i++) {
            if (igrac1[i].equals(figure[0])) {
                suma1 += 12;
            } else if (igrac1[i].equals(figure[1])) {
                suma1 += 5;
            } else if (igrac1[i].equals(figure[2])) {
                suma1 += 3;
            } else if (igrac1[i].equals(figure[3])) {
                suma1 += 3;
            } else if (igrac1[i].equals(figure[4])) {
                suma1 += 1;
            }
        }

        int suma2 = 0;
        for (int i = 0; i < igrac2.length; i++) {
            if (igrac2[i].equals(figure[0])) {
                suma2 += 12;
            } else if (igrac2[i].equals(figure[1])) {
                suma2 += 5;
            } else if (igrac2[i].equals(figure[2])) {
                suma2 += 3;
            } else if (igrac2[i].equals(figure[3])) {
                suma2 += 3;
            } else if (igrac2[i].equals(figure[4])) {
                suma2 += 1;
            }
        }
        System.out.println();
        int razlika = suma1 - suma2;
        if (suma1 > suma2) {
            System.out.println("Prvi igrac je u prednosti za " + razlika + " sahovskih bodova.");
        } else if (suma2 > suma1) {
            System.out.println("Drugi igrac je u prednosti za " + razlika + " sahovskih bodova.");
        } else {
            System.out.println("Igraci imaju isti broj sahovskih bodova.");
        }
    }
}
