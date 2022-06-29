package JavaBasic.Homework1;

import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ispod su prikazani redni brojevi dana u nedelji:");
        System.out.println("1-Ponedeljak");
        System.out.println("2-Utorak");
        System.out.println("3-Sreda");
        System.out.println("4-Cetvrtak");
        System.out.println("5-Petak");
        System.out.println("6-Subota");
        System.out.println("7-Nedelja");
        System.out.println("Unesite redni broj dana u nedelji:");

        int x = sc.nextInt();

        if (x < 1 || x > 7) {
            System.out.println("Niste uneli ispravan redni broj!");
            //ovde petlja sve dok se ne unese redni broj
        }
        if (x >= 1 && x <= 5) {
            System.out.println("Danas je radni dan.");
        }
        else if (x >=6 && x<=7){
                System.out.println("Danas je vikend! Uzivajte u vikendu! :) ");
            }
        }

    }
