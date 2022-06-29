package JavaOOP.Homework6;

import OOP.zadaciSaCasa.maj27pet.Covek;

public class testAutomobil {
    public static void main(String[] args) {
        Automobil prviAuto = new Automobil("BMW", "500", 1, "Mirko");
        Automobil drugiAuto = new Automobil("VW", "Golf5", 2, "Zivko");
        Automobil treciAuto = new Automobil("Fiat", "500L", 3, "Pera");
        System.out.println(treciAuto);
        System.out.println("--------------");
        treciAuto.setVlasnik("Mika");
        System.out.println(treciAuto);
        System.out.println("--------------");
        System.out.println(treciAuto.getVlasnik());
        System.out.println(treciAuto.getSerijskiBroj());
        System.out.println(prviAuto.getSerijskiBroj());
        System.out.println(prviAuto.getVlasnik());
        System.out.println("----------------------");
        prviAuto.setVlasnik("Joca");
        System.out.println(prviAuto.getVlasnik());

    }
}
