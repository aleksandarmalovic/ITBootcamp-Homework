package JavaOOP.Homework8;

import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {
        RekreativniPlaninar aca = new RekreativniPlaninar(1, "Aca",
                "Malovic", 22, "Jablanicki", 999);

        Planina planina1 = new Planina("Radan",
                "Srb", 800);

        Alpinista acaM = new Alpinista(1, "Aleksandar", "Milenkovic", 9);


        System.out.println(aca.uspesanUspon(planina1));
        System.out.println(aca.kolikoMozeDaPredje());
        System.out.println(aca.toString());

        System.out.println(aca.vratiClanarinu());
        System.out.println("********************");
        ArrayList<Planinar> listaPlaninara = new ArrayList<>();
        listaPlaninara.add(aca);
        listaPlaninara.add(new RekreativniPlaninar(2, "Pera", "Peric", 21,
                "Pcinjski", 998));
        listaPlaninara.add(new RekreativniPlaninar(3,"Petar", "Petrovic", 9,
                "Vranjski", 356));
        listaPlaninara.add(new Alpinista(2, "Strahinja", "Trninic", 10 ));
        listaPlaninara.add(new Alpinista(3, "Cvijan", "Peranovic", 9));
        listaPlaninara.add(acaM);

        int sum = 0;
        for (Planinar planinar : listaPlaninara) {
            System.out.println(planinar.toString());
            if (planinar.uspesanUspon(planina1)) {
                System.out.println("Uspesan uspon!");
            } else {
                System.out.println("Na zalost, uspon je neuspesan.");
            }
            System.out.println("********************");
            sum += planinar.vratiClanarinu();
        }
        System.out.println("Zbir svih clanarina je: " + sum);
    }
}
