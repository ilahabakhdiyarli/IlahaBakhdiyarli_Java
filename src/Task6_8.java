import java.util.Scanner;
public class Task6_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zəhmət olmasa yaşınızı daxil edin: ");
        int yas = sc.nextInt();
        int biletQiymeti = 0;


        if (yas >= 0 && yas <= 7) {
            biletQiymeti = 0;
        } else if (yas >= 8 && yas <= 17) {
            biletQiymeti = 3;
        } else if (yas >= 18 && yas <= 64) {
            biletQiymeti = 7;
        } else {
            biletQiymeti = 4;
        }
        System.out.println("Sizin yaş qrupu üçün 1 biletin qiyməti: " + biletQiymeti + " AZN");

        System.out.print("Neçə bilet almaq istəyirsiniz? ");
        int say = sc.nextInt();


        double sum=say*biletQiymeti;
        System.out.print("Umumi mebleg: "+sum);


    }}