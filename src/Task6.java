public class Task6 {
    public static void main(String[] args) {

        final double PI         = 3.14159;
        final int    MAX_DENEME = 3;
        final String BANK_KODU  = "ABB01";

        System.out.println("PI:          " + PI);
        System.out.println("MAX_DENEME:  " + MAX_DENEME);
        System.out.println("BANK_KODU:   " + BANK_KODU);

        /* PI = 3.15;
         "Java: cannot assign a value to final variable PI"
         MAX_DENEME = 5;
         "Java: cannot assign a value to final variable MAX_DENEME"
         BANK_KODU = "XYZ99";
         "Java: cannot assign a value to final variable BANK_KODU" xəta mesajları çıxır.

          Səbəb:Final dəyərlər dıyişdirilə bilməz.*/
    }
}
