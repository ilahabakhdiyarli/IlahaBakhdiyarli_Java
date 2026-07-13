import java.util.Scanner;

public class Task7_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Seyfin kodu---");
        int kod = 275;
        int cehd = 0;

        while (true) {
            System.out.print("Texmininizi daxil edin: ");
            int texmin = input.nextInt();
            cehd++;

            if (texmin == kod) {
                System.out.println("Seyf açıldı!");
                break;                       // dongunu dayandirir
            } else if (texmin < kod) {
                System.out.println("Kiçikdir");
            } else {
                System.out.println("Böyükdür");
            }
        }
        System.out.println("Cəhd sayı: " + cehd);
        input.close();
    }
}

