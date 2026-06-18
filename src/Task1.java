public class Task1 {
    public static void main (String[] args) {
        String musteriAdi = "Aydan";
        int hesabNomresi = 1234567890;
        double balans = 3842.50;
        boolean aktiv = true;
        String hesabNovu ="Emanet";


        System.out.printf("%-15s : %s%n", "Musteri adi", musteriAdi);
        System.out.printf("%-15s : %d%n", "Hesab nomresi", hesabNomresi);
        System.out.printf("%-15s : %.2f%n", "Balans", balans);
        System.out.printf("%-15s : %b%n", "Aktivlik", aktiv);
        System.out.printf("%-15s : %s%n", "Hesab novu", hesabNovu);
    }
}

