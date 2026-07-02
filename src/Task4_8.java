import java.util.Scanner;
public class Task4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius dərəcəsini daxil edin: ");
        int c = sc.nextInt();

        //versiya 1
        double faranheit1 = c*9/5+32; // int bölmə: 9/5=1, kəsr itir -> sehv nəticə

        //versiya 2
        double faranheit2 = c*9.0/5+32; // 9.0 double: 9.0/5=1.8 -> dogru nəticə

        System.out.println("Celsius: " + c);
        System.out.println("Faranheit ilk versiya: " + faranheit1);
        System.out.println("Faranheit ikinci versiya: " + faranheit2);

        //int/int olduqda kesr hisse itir,ona gore double/int duzgun netice verir.kesr hisseni de getirir
        //commit zamani c*9/5 warning cixir

}}
