package JavaBasic.Homework4;

import java.util.Scanner;

import static java.lang.System.in;

public class zadatak2 {
    public static boolean prestupnaGodina(int x){
        boolean rezultat = false;
        if ((x % 4 == 0) && (x % 400 == 0 || x % 100 != 0)) {
            rezultat = true;
            System.out.print(rezultat);
        }
        else {
            System.out.print(rezultat);
        }
        return rezultat;
    }


    public static void main(String[] args) {
        System.out.println("Unesite godinu: ");
        Scanner sc = new Scanner(in);
        int x = sc.nextInt();
        prestupnaGodina(x);
    }

}
