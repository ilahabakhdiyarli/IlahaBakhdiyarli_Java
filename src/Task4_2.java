import java.util.Scanner;
public class Task4_2 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Kredit məbləği: ");
        int mebleg = sc.nextInt();

        System.out.print("İllik faiz: " );
        double faiz = sc.nextDouble();

        System.out.print("Müddət: ");
        int muddet = sc.nextInt();

        double umumiFaiz = mebleg*(faiz/100);
        double umumiOdenis = mebleg+umumiFaiz;
        double ayliqOdenis = umumiOdenis/muddet;

        System.out.println("Ümumi faiz: " + umumiFaiz + "AZN");
        System.out.println("Ümumi ödəniş: " + umumiOdenis + "AZN");
        System.out.println("Aylıq ödəniş: " + ayliqOdenis + "AZN");

}}
