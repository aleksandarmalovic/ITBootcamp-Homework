package JavaBasic.Homework4;
// ODRADJENE SU SVE 3 F-je, SAMO JE POTREBNO "OSLOBODITI" ZELJENU F-ju
import java.util.Arrays;
import java.util.Scanner;

public class zadatak4 {
    // 4.a //
    public static boolean hasDuplicates(int niz[]) {
        boolean rez = false;

        for (int i = 0; i < niz.length; i++) {
            int j = i + 1;
            while (j < niz.length) {
                if (niz[i] == niz[j]) {
                    rez = true;
                    j = niz.length;
                    i = niz.length;
                } else {
                    j++;
                }
            }
        }
        System.out.println("U nizu postoje isti elementi? " +rez);
        return rez;
    }
        // 4.b //
    public static int numbersOfDuplicates(int niz[]) {
        int rez = 0;
        for (int i = 0; i < niz.length; i++) {
            int j = i + 1;
            while (j < niz.length) {
                if (niz[i] == niz[j]) {
                    rez++;
                    j = niz.length;
                } else {
                    j++;
                }
            }
        }
        System.out.println("Broj duplikata je: " +rez);

        return rez;
    }
        // 4.c //
    public static int[] duplicatedNiz(int niz[]) {
        int[] bezDuplikata = new int[niz.length];
        bezDuplikata[0] = niz[0];
        int brojac = 1;
        //int j = 0;

        for (int i = 1; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i] == bezDuplikata[j]) {
                    j = niz.length;
                } else if (j == (niz.length - 1)) {
                    bezDuplikata[brojac] = niz[i];
                    brojac++;
                }
            }
        }
        //System.out.println(brojac);
        //System.out.println("Niz bez duplikata je: " + Arrays.toString(bezDuplikata));
        int[] skraceni = new int[brojac];
        for (int i = 0; i < skraceni.length; i++) {
            skraceni[i] = bezDuplikata[i];
        }
        if (brojac<niz.length) {
            System.out.println("Skraceni niz bez duplikata je: "+ Arrays.toString(skraceni));
        }
        else {
            System.out.println("Niz nema duplirane elemente!");
        }
        return skraceni;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Unesite duzinu niza: ");
            int n = sc.nextInt();
            int[] niz = new int[n];
            System.out.print("Unesite elemente niza: ");
            for (int i = 0; i < niz.length; i++) {
                niz[i] = sc.nextInt();
            }
            System.out.println("Uneti niz je: " +Arrays.toString(niz));

            //hasDuplicates(niz);             //4.a
            //numbersOfDuplicates(niz);       //4.b
            //duplicatedNiz(niz);             //4.c
        }
    }
