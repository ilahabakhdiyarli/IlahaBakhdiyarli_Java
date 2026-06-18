public class Task9 {
    public static void main(String[] args) {

        System.out.println("Numune 1:");
        int sayi =583;
        int yuzler = sayi/100;
        int onlar = (sayi%100)/10;
        int birler = sayi%10;
        int cem = yuzler + onlar + birler;

        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);
        System.out.println(cem);

        System.out.println("Numune 2:");
        sayi =907;
        yuzler = sayi/100;
        onlar = (sayi%100)/10;
        birler = sayi%10;
        cem = yuzler + onlar + birler;
        System.out.println(yuzler);
        System.out.println(onlar);
        System.out.println(birler);
        System.out.println(cem);


    }
}