import java.util.Scanner;

public class Task5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ay nomresini daxil edin: ");
        int ay = sc.nextInt();

        switch (ay) {
            case 12, 1, 2:
                System.out.println("Qis");
                break;
            case 3, 4, 5:
                System.out.println("Yaz");
                break;
            case 6, 7, 8:
                System.out.println("Yay");
                break;
            case 9, 10, 11:
                System.out.println("Payiz");
                break;
            default:
                System.out.println("Yanlış ay nömrəsi");
        }
        sc.close();

    }
}