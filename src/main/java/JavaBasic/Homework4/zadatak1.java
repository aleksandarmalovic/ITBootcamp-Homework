package JavaBasic.Homework4;
// link ka kati: https://www.codewars.com/kata/54ff3102c1bad923760001f3/java
import java.util.Scanner;

public class zadatak1 {

    public static int numberOfVowels (String niska){
        int numberOfVowels = 0;

        char[] charArray = niska.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u') {
                numberOfVowels+=1;
            }
        }
        System.out.println(numberOfVowels);
        return numberOfVowels;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite nisku: ");
        String niska = sc.nextLine();
        numberOfVowels(niska);
    }
}
