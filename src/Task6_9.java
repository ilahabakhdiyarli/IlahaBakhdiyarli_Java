import java.util.Scanner;

public class Task6_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1) Cəm (+)\n2) Fərq (-)\n3) Hasil (*)\n4) Bölmə (/)\n0) Çıxış");
            System.out.print("Seçiminizi edin: ");

            int secim = sc.nextInt();

            if (secim == 0) {
                System.out.println("Kalkulyator bağlandı.");
                break;
            }

            if (secim < 0 || secim > 4) {
                System.out.println("-> Səhv seçim! Yalnız 0-4 arası rəqəm yazın.");
                continue; // continue birbaşa dövrün başına qaytarır
            }

            System.out.print("Birinci ədədi daxil edin: ");
            double first = sc.nextDouble();

            System.out.print("İkinci ədədi daxil edin: ");
            double second = sc.nextDouble();

            switch (secim) {
                case 1:
                    System.out.println("Cəm " + (first + second));
                    break;
                case 2:
                    System.out.println("Fərq " + (first - second));
                    break;
                case 3:
                    System.out.println("Hasil " + (first * second));
                    break;
                case 4:
                    // Bölmə əməliyyatı üçün 0-a bolme qeyd olunmalidir
                    if (second == 0) {
                        System.out.println("Sıfıra bölmək olmaz!");
                    } else {
                        System.out.println("Bölmə " + (first / second));
                    }
                    break;
                default:
                    // Əgər menudakindan fərqli bir rəqəm yazılarsa
                    System.out.println("Səhv seçim etdiniz!");
                    break;
            }
        }

        sc.close();


    }
}