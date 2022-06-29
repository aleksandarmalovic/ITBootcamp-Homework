package JavaOOP.Homework9;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {

        Vozac aca = new Vozac("Aca", "Malovic", "Sofer");

        System.out.println(aca);

        Putnik cvijan = new Putnik("Cvijan", "Peranovic", 500);
        Putnik acaM = new Putnik("Aca", "Milenkovic", 5000);

        System.out.println(cvijan.getIme() + " " + cvijan.getNovac());

        int n;
        n = cvijan.oduzmiNovac(200);
        System.out.println(cvijan.getIme() + " " + cvijan.getNovac());
        System.out.println(acaM.oduzmiNovac(2000));
        System.out.println(acaM.getIme() + " ima " + acaM.getNovac()) ;
        acaM.dodajNovac(5000);
        System.out.println(acaM.getIme() + " ima " + acaM.getNovac());

        ArrayList<Putnik> listaPutnika = new ArrayList<>();

        System.out.println(listaPutnika.size());

        listaPutnika.add(cvijan);
        listaPutnika.add(acaM);
        System.out.println(listaPutnika.size());

        Autobus a1 = new Autobus("Globus", aca, 150, listaPutnika);
    }
}
