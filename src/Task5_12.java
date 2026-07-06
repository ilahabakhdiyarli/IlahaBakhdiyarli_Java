import java.util.Scanner;

public class Task5_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Yasinizi qeyd edin: ");

        int yas = sc.nextInt();

        //Yaş aralıqları else if zəncirində ardıcıl daralır — hər sonrakı şərtdə alt sərhəd yazmağa ehtiyac qalmır
        if (yas >= 0 && yas <= 5) {
            System.out.println("Pulsuz");
        } else if (yas >= 6 && yas <= 17) {
            System.out.println("5 AZN");
        } else if (yas >= 18 && yas <= 64) {
            System.out.println("10 AZN");
        } else if (yas >= 65) {
            System.out.println("3 AZN");
        } else if (yas < 0) {
            System.out.println("Yanlış yaş");
        }
        sc.close();
    }
}
