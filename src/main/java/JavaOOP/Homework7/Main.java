package JavaOOP.Homework7;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sastojak jaja = new Sastojak("Jaja", 15.5);
        Sastojak mleko = new Sastojak("Mleko", 0.1);
        Sastojak brasno = new Sastojak("Brasno", 0.075);

        //System.out.println(jaja.getCena());
        SastojakRecepta petJaja = new SastojakRecepta(jaja.getNaziv(), jaja.getCena(), 5);
        //System.out.println(petJaja.ukupnaCena());
        SastojakRecepta polaLitareMleka = new SastojakRecepta(mleko.getNaziv(), mleko.getCena(), 500);
        SastojakRecepta kiloBrasna = new SastojakRecepta(brasno.getNaziv(), brasno.getCena(), 1000);

        ArrayList<SastojakRecepta> sastojci = new ArrayList<>();
        Recept palacinke = new Recept("Slatke palacinke", 2, sastojci);
        sastojci.add(petJaja);
        sastojci.add(polaLitareMleka);
        sastojci.add(kiloBrasna);

        System.out.println(palacinke);
        //System.out.println(palacinke.ukupnaCenaRecepta());

    }
}
