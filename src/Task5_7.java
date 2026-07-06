import java.util.Scanner;
public class Task5_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Yasinizi qeyd edin: ");
        int yas=sc.nextInt();

        System.out.println("Gelirinizi qeyd edin: ");
        double gelir=sc.nextDouble();

        System.out.println("Kredit meblegini qeyd edin: ");
        double kredit=sc.nextDouble();

        if (yas >= 21 && yas <= 65 && gelir > 800 && kredit >= 300 && kredit <= 50000) {
            System.out.println("TƏSDİQ EDİLDİ");
        } else if (yas < 21 || yas > 65) {
            System.out.println("Rədd edildi: yaş uyğun deyil");
        } else if (gelir <= 800) {
            System.out.println("Rədd edildi: gəlir uyğun deyil");
        } else {
            System.out.println("Rədd edildi: məbləğ uyğun deyil");
        }

        sc.close();
    }
}