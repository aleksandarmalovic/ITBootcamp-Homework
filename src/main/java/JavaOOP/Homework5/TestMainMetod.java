package JavaOOP.Homework5;

public class TestMainMetod {
    public static void main(String[] args) {
        Knjiga maliPrinc = new Knjiga("Nolit", "Mali Princ",55);
        Knjiga anaKarenjina = new Knjiga("Laguna", "Ana Karenjina", 666);
        Knjiga hajduci = new Knjiga("Delfi", "Hajduci", 108);

        Automobil golfDvojka = new Automobil("VW", "Golf2", 1500);
        Automobil fijat500L = new Automobil("Fiat", "500L", 999);
        Automobil mazda3 = new Automobil("Mazda", "3", 1900);


        System.out.println("Model fijata je: " + fijat500L.model + ".");
        System.out.println("Knjiga mali princ ima " + maliPrinc.brojStranica + " stranica.");

        }

    }
