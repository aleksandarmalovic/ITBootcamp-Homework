package JavaOOP.Homework9;

import java.util.ArrayList;

public class Autobus {

    private String naziv;
    private Vozac v;
    private int cenaKarte;
    private ArrayList<Putnik> listaPutnika;


    public Autobus(String naziv, Vozac v, int cenaKarte, ArrayList<Putnik> listaPutnika) {
        this.naziv = naziv;
        this.v = v;
        this.cenaKarte = cenaKarte;
        this.listaPutnika = listaPutnika;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Vozac getV() {
        return v;
    }

    public void setV(Vozac v) {
        this.v = v;
    }

    public int getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(int cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public ArrayList<Putnik> getListaPutnika() {
        return listaPutnika;
    }

    public void setListaPutnika(ArrayList<Putnik> listaPutnika) {
        this.listaPutnika = listaPutnika;
    }

    public void dodajPutnika (Putnik p) {
        listaPutnika.add(p);
    }

    public boolean daLiSuIsti(Putnik p1, Putnik p2){
        return p1.getIme().equalsIgnoreCase(p2.getIme()) &&
                p1.getPrezime().equalsIgnoreCase(p2.getPrezime());
    }

    public void obrisiPutnika (Putnik p) {
        for (int i = 0; i < listaPutnika.size(); i++) {
            Putnik trenutni = listaPutnika.get(i);
            if (daLiSuIsti(trenutni, p)){
                listaPutnika.remove(trenutni);
            }


        }
    }
}