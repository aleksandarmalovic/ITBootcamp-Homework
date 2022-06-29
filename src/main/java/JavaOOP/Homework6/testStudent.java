package JavaOOP.Homework6;

import java.util.Scanner;

public class testStudent {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unestite broj bodova: ");
        double rez = sc.nextDouble();
        Student prviStudent = new Student("Aleksandar", "Malovic", "BG126QA13", "QA testiranje", rez);
        System.out.println(prviStudent);

    }
}
