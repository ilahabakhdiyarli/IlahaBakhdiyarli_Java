import java.util.Scanner;

public class Task8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Ədəd daxil edin: ");
            number = scanner.nextInt();

            if (number <= 0) {
                System.out.println("Yenidən daxil edin:");
            }
        } while (number <= 0);

        System.out.println("Qəbul edildi: " + number);

        scanner.close();
    }
}
