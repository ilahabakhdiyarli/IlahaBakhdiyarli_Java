import java.util.Scanner;

public class Task7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Anbar stoku---");
        System.out.print("Müsbət ədəd = mal gəlib, mənfi ədəd = mal satılıb");
        int stock = 200;

        while (true) {
            System.out.print("Emeliyyat daxil et (dayanmaq ucun 0): ");
            int emeliyyat = input.nextInt();

            if (emeliyyat == 0) {
                break;
            }

            stock += emeliyyat;
            System.out.println("Yeni stok: " + stock);
        }
        input.close();
    }
}
