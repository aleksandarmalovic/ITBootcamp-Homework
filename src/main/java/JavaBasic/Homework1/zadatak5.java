package JavaBasic.Homework1;

import java.util.Scanner;

public class zadatak5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int j = x % 10;
        int d = (x%100)/10-j/10;
        int s = (x/100)-d/10-j/100;

        System.out.println("Cifra stotice je: "+s);
        System.out.println("Cifra desetice je: "+d);
        System.out.println("Cifra jedinice je: "+j);

        if (Math.pow(s,3) + Math.pow(d,3) + Math.pow(j,3) == x){
            System.out.println("Ovo je Armstrongov broj!");
        }
        else {
            System.out.println("Ovo nije Armstrongov broj!");
        }
    }
}
