package JavaBasic.Homework4;

import java.util.Scanner;

import static java.lang.System.in;

public class zadatak3 {

    public static String stringPutaBroj(String niska, int broj) {
        if (broj == 0) {
            niska = "";
        } else {
            for (int i = 1; i < broj; i++) {
                niska += niska;
            }
        }
        System.out.println(niska);
        return niska;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.print("Unesite nisku: ");
        String niska = sc.nextLine();
        System.out.print("Unesite broj: ");
        int broj = sc.nextInt();
        stringPutaBroj(niska, broj);
    }
}