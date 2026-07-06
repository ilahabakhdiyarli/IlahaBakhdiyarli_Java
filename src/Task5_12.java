import java.util.Scanner;

public class Task5_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yasinizi qeyd edin: ");

        int yas = sc.nextInt();

        // Mənfi yaş ən xüsusi haldır, ona görə əvvəlcə yoxlanılır.
        // Sonrakı hər else if-də alt sərhəd yazmağa ehtiyac qalmır,
        // çünki əvvəlki şərtin yalan olması onu artıq təmin edir.
        if (yas < 0) {
            System.out.println("Yanlış yaş");
        } else if (yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas <= 64) {
            System.out.println("10 AZN");
        } else {
            System.out.println("3 AZN");
        }
        sc.close();
    }
}
