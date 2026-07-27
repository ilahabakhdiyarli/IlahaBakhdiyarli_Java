public class Task11_2 {
    public static void main(String[] args) {

        // 1-ci hal: null
        String kartSahibi = null;
        try {
            int simvolSayi = kartSahibi.length();
            System.out.println("Adın simvol sayı: " + simvolSayi);
        } catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        } finally {
            System.out.println("Sessiya bağlandı");
        }

        System.out.println("-----");

        // 2-ci hal: real ad
        String kartSahibi2 = "Ilaha";
        try {
            int simvolSayi = kartSahibi2.length();
            System.out.println("Adın simvol sayı: " + simvolSayi);
        } catch (NullPointerException e) {
            System.out.println("Kart məlumatı tapılmadı");
        } finally {
            System.out.println("Sessiya bağlandı");
        }
    }
}