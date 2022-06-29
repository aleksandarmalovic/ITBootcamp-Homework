package JavaOOP.Homework7;


public class SastojakRecepta extends Sastojak {
    private double kolicinaSastojka;

    public SastojakRecepta(String naziv, double cena, double kolicina) {
        super(naziv, cena);
        this.kolicinaSastojka = kolicina;
    }

    public double getKolicinaSastojka() {
        return kolicinaSastojka;
    }

    public void setKolicina(double kolicina) {
        this.kolicinaSastojka = kolicina;
    }
    public double ukupnaCena() {
        return this.kolicinaSastojka * super.getCena();
    }

}
