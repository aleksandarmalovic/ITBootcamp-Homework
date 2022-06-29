package JavaOOP.Homework8;

public class Alpinista extends Planinar{

    private int brojPoena;

    public Alpinista(int id, String ime, String prezime, int brojPoena) {
        super(id, ime, prezime);
        this.brojPoena = brojPoena;
    }

    public Alpinista(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    @Override
    public void Stampaj() {
        System.out.println(toString());

    }

    @Override
    public int vratiClanarinu() {
        return 1500 - popust();
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(p.getVisinaPlanine() <= 4000) {
            return true;
        }
        return false;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int popust (){
        int popust = brojPoena * 50;
        return popust;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Alpinista, id: ").append(getId()).append(System.lineSeparator());
        sb.append("Ime: ").append(getIme()).append(" ").append(getPrezime()).append(System.lineSeparator());
        sb.append("Broj poena: ").append(brojPoena);
        return sb.toString();
    }
}