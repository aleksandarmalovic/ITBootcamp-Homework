package JavaOOP.Homework6;

public class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private String smer;
    private double rezultatiIspita;

    public Student(String ime, String prezime, String brojIndeksa, String smer, double rezultatiIspita){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.smer = smer;
        this.rezultatiIspita = rezultatiIspita;

    }

    public Student(){
        this.ime = "";
        this.prezime = "";
        this.brojIndeksa = "";
        this.rezultatiIspita = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getSmer() {
        return smer;
    }

    public void setSmer(String smer) {
        this.smer = smer;
    }

    public void setRezultatiIspita(double rezultatiIspita) {
        this.rezultatiIspita = rezultatiIspita;
    }

    public double getRezultatiIspita() {
        return rezultatiIspita;
    }

    public boolean polozioIspit(){
        if (this.rezultatiIspita >= 51)
            return true;
        return false;
    }

    @Override
    public String toString() {
        String opis = "Ime i prezime studenta: ".concat(this.ime).concat(" ").concat(this.prezime).concat("\n");
        opis = opis.concat("Broj indeksa: ").concat(this.brojIndeksa).concat("\n");
        opis = opis.concat("Smer: ").concat(this.smer).concat("\n");
        opis = opis.concat("Rezultati ispita: ").concat(String.valueOf(this.rezultatiIspita)).concat("\n");
        if (polozioIspit()){
            opis = opis.concat("Student je polozio ispit.");
        }
        else {
            opis = opis.concat("Studnet nije polozio ispit.");
        }
        return opis;
    }
}
