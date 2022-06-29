package JavaOOP.Homework9;

public class Vozac extends Covek{
    private String zvanje;

    public Vozac(String ime, String prezime, String zvanje) {
        super(ime, prezime);
        this.zvanje ="Sofer";
    }

    public Vozac(String zvanje) {
        this.zvanje = "Sofer";
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }
}