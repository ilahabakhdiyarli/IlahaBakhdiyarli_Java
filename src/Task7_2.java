import java.util.Scanner;

public class Task7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mağazanın həftəlik satışı");
        double total = 0;
        int day = 3;
        for (int i = 1; i <= day; i++) {
            System.out.print(i + "-ci günün satışı: ");
            double payment = sc.nextDouble();
            total = total + payment;
        }

        double average = total / day;

        System.out.println("Umumi mebleg: "+total);
        System.out.println("Orta gunluk satis: "+average);

        if (average > 500) {
            System.out.println("Həftə uğurludur");
        }else{
                System.out.println("Satışı artırmaq lazımdır");

        }
        sc.close();
    }
}