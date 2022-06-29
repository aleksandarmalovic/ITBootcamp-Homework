package JavaOOP.Homework8;

public class RekreativniPlaninar extends Planinar{
    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUspon;

    public RekreativniPlaninar(int id, String ime, String prezime, int tezinaOpreme,
                               String nazivOkruga, int maksimalniUspon) {
        super(id, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUspon = maksimalniUspon;
    }

    public RekreativniPlaninar(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public int getMaksimalniUspon() {
        return maksimalniUspon;
    }

    @Override
    public void Stampaj() {

    }

    @Override
    public int vratiClanarinu() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina p) {
        if(kolikoMozeDaPredje() >= p.getVisinaPlanine()){
            return true;
        }
        return false;
    }

    public int kolikoMozeDaPredje (){
        int kolikoMozeDaPredje = maksimalniUspon - tezinaOpreme * 50;
        return kolikoMozeDaPredje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Rekreativac, ID: ").append(getId()).append("\n");
        sb.append("ime: ").append(getIme()).append(" ").append(getPrezime())
                .append(" Okrug: ").append(getNazivOkruga());

        return sb.toString();
    }
}
