package JavaOOP.Homework9;

public class Covek {
    private String ime;
    private String prezime;

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public Covek() {
        this.ime = "";
        this.prezime = "";
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}