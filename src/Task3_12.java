public class Task12 {
    public static void main(String[] args) {
        String tamAd = "nigar əliyeva";

        int bosluq = tamAd.indexOf(" ");

        String ad    = tamAd.substring(0, bosluq);   // 0-dan boşluğa qədər = "nigar"
        String soyad = tamAd.substring(bosluq + 1);  // boşluqdan sonra = "əliyeva"

        String adFormat    = ad.substring(0, 1).toUpperCase()    + ad.substring(1);  // adFormat = "N" + "igar" = "Nigar"
        String soyadFormat = soyad.substring(0, 1).toUpperCase() + soyad.substring(1); // soyadFormat = "Ə" + "liyeva" = "Əliyeva"

        String basHerfler = ad.substring(0, 1).toUpperCase() + "."
                + soyad.substring(0, 1).toUpperCase() + ".";
        // "N." + "Ə." = "N.Ə."

        System.out.println("Tam ad (formatlanmış): " + adFormat + " " + soyadFormat);
        System.out.println("Yalnız ad: " + adFormat);
        System.out.println("Yalnız soyad: " + soyadFormat);
        System.out.println("Baş hərflər: " + basHerfler);
        System.out.println("Böyük hərflə: " + tamAd.toUpperCase());
    }
}
