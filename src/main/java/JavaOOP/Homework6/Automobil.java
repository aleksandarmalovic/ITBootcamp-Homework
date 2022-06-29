package JavaOOP.Homework6;

public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;

    private String vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, String vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public Automobil() {
        this.marka = "";
        this.model = "";
        this.serijskiBroj = 0;
        this.vlasnik = "";
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public String getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(String vlasnik) {
        this.vlasnik = vlasnik;
    }

    @Override
    public String toString() {
        String opis = "Marka: ".concat(this.marka).concat("\n");
        opis = opis.concat("Model: ").concat(this.model).concat("\n");
        opis = opis.concat("Serijski broj: ").concat(String.valueOf(this.serijskiBroj)).concat("\n");
        opis = opis.concat("Vlasnik je: ").concat(this.vlasnik);
        return opis;
    }
}
