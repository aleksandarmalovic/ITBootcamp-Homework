package JavaBasic.Homework1;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zdravo! Dobrodosli u nasu pivnicu!");
        System.out.println("Pre pocetka, molimo Vas unesite broj godina:");
        int x;
        x = sc.nextInt();

        if (x > 0 && x < 18) {
            System.out.println("Osobama mladjim od 18 godina nije dozvoljeno konzumiranje alkohola.");
            System.out.println("Ocekujemo Vas na proslavi punoletsva!");
        } else if (x >= 18) {
            System.out.println("Dobrodosli u nasu pivnicu.");
            System.out.println("Imamo siroki asortipan piva u ponudi. Ziveli!");
        } else {
            System.out.println("Niste uneli ispravan broj godina.");
            //ovde bi bilo pravo mesto da se ceo proces ugnjezdi u petlju
            //petlja bi nas vracala svaki put na pocetak prilikom unosa godina <=0

        }
    }
}

