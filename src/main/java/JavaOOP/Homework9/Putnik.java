package JavaOOP.Homework9;

public class Putnik extends Covek {
    private int novac;

    public Putnik(String ime, String prezime, int novac) {
        super(ime, prezime);
        this.novac = novac;
    }

    public Putnik(int novac) {
        this.novac = novac;
    }

    public int getNovac() {
        return novac;
    }

    public void setNovac(int novac) {
        this.novac = novac;
    }

    public int oduzmiNovac (int kolicinaNovcaKojiOduzimamo){
        novac = novac - kolicinaNovcaKojiOduzimamo;
        return novac;
    }

    public int dodajNovac (int kolicinaNovcaKojiDodajemo){
        novac = novac + kolicinaNovcaKojiDodajemo;
        return novac;
    }
}