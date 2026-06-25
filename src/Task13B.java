public class Task13B {
   public static void main(String[] args) {

       final int    MIN_YAS        = 18;
       final int    MIN_PAROL_UZUN = 8;
       final double MIN_GELIR      = 500.0;

       String ad     = "Nigar";
       int    yas    = 22;
       double gelir  = 1500.0;
       String parol  = "user@2024";
       String email  = "nigar@bank.az";

       boolean adUygun    = ad.length() > 0;
       boolean yasUygun   = yas >= MIN_YAS;
       boolean gelirUygun = gelir > MIN_GELIR;
       boolean parolUygun = parol.length() >= MIN_PAROL_UZUN;
       boolean emailUygun = email.contains("@");

       boolean qeydiyyatUgurlu = adUygun && yasUygun && gelirUygun
               && parolUygun && emailUygun;

       String adFormat = ad.substring(0, 1).toUpperCase() + ad.substring(1);

       System.out.println("===== QEYDİYYAT YOXLAMASI =====");
       System.out.println("İstifadəçi: " + adFormat);
       System.out.println();
       System.out.println("Ad uyğun:           " + adUygun);
       System.out.println("Yaş uyğun:          " + yasUygun);
       System.out.println("Gəlir uyğun:        " + gelirUygun);
       System.out.println("Parol uyğun:        " + parolUygun);
       System.out.println("Email uyğun:        " + emailUygun);
       System.out.println("------------------------------");
       System.out.println("Qeydiyyat uğurlu:   " + qeydiyyatUgurlu);

}
}
