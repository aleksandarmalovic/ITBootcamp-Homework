package JavaOOP.Homework8;

public class Planina {

    private String imePlanine;
    private String drzavaUKojojSeNalazi;
    private int visinaPlanine;

    public Planina(String imePlanine, String drzavaUKojojSeNalazi, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.drzavaUKojojSeNalazi = drzavaUKojojSeNalazi;
        this.visinaPlanine = visinaPlanine;
    }

    public Planina() {
        this.imePlanine = "";
        this.drzavaUKojojSeNalazi = "";
        this.visinaPlanine = 0;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public String getDrzavaUKojojSeNalazi() {
        return drzavaUKojojSeNalazi;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }
}

