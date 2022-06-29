package JavaOOP.Homework7;

import java.util.ArrayList;

public class Recept {
    private String nazivRecepta;
    private int tezinaRecepta;
    private ArrayList<SastojakRecepta> sastojci;

    public Recept(String nazivRecepta, int tezinaRecepta, ArrayList<SastojakRecepta> sastojci) {
        this.nazivRecepta = nazivRecepta;
        this.tezinaRecepta = tezinaRecepta;
        this.sastojci = sastojci;
    }

    public String getNazivRecepta() {
        return nazivRecepta;
    }

    public void setNazivRecepta(String nazivRecepta) {
        this.nazivRecepta = nazivRecepta;
    }

    public int getTezinaRecepta() {
        return tezinaRecepta;
    }

    public void setTezinaRecepta(int tezinaRecepta) {
        this.tezinaRecepta = tezinaRecepta;
    }

    public ArrayList<SastojakRecepta> getSastojci() {
        return sastojci;
    }

    public void setSastojci(ArrayList<SastojakRecepta> sastojci) {
        this.sastojci = sastojci;
    }

    public void dodajSastojak(SastojakRecepta sastojak){
        sastojci.add(sastojak);
    }

    public boolean daLiSuIsti (SastojakRecepta sr1, SastojakRecepta sr2) {
        return (sr1.getNaziv().equals(sr2.getNaziv()) && sr1.getCena() == sr2.getCena() && sr1.getKolicinaSastojka() == sr2.getKolicinaSastojka());
    }

    public void ukloniSastojak (SastojakRecepta s) {
        for (int i = 0; i < sastojci.size(); i++){
            SastojakRecepta trenutni = sastojci.get(i);
            if (daLiSuIsti(trenutni, s)) {
                sastojci.remove(i);
            }
        }
    }

    public String tezinaRecepta() {
        String nivo = "";
        if (tezinaRecepta == 1) {
            nivo = "Pocetni nivo";
        } else if (tezinaRecepta == 2) {
            nivo = "Lak nivo";
        } else if (tezinaRecepta == 3) {
            nivo = "Srednji nivo";
        } else if (tezinaRecepta == 4) {
            nivo = "Tezak nivo";
        } else if (tezinaRecepta == 5) {
            nivo = "Majstorski nivo";
        } else {
            nivo = "Uneli ste nepostojeci nivo!";
        }
        return nivo;
    }
    
    public double ukupnaCenaRecepta() {
        double sum = 0;
        for (SastojakRecepta sastojakRecepta : sastojci) {
            sum += sastojakRecepta.ukupnaCena();
        }
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(nazivRecepta).append(":\n");
        sb.append("Tezina: ").append(tezinaRecepta()).append("\n");
        sb.append("Sastojci: ").append(sastojci.get(0).getNaziv());
        for (int i = 1; i < sastojci.size(); i++) {
            sb.append(", ");
            sb.append(sastojci.get(i).getNaziv());
        }
        return sb.toString();
    }
}
