import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("3reqemli tam eded yazin: ");
        int say = sc.nextInt();

        int yuzler = say/100;
        int onlar = (say % 100) / 10;
        int birler = say%10;
        int cem = yuzler+onlar+birler;

        System.out.println("Yuzler: " + yuzler);
        System.out.println("Onlar: "+onlar);
        System.out.println("Birler: " +birler);
        System.out.println("Cem: " +cem);

    }
}
