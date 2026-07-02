import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir ədəd daxil edin: ");
        double eded = sc.nextDouble();

        int castNetice = (int) eded;
        long roundNetice = Math.round(eded);

        System.out.println("Casting netice: " + castNetice);
        System.out.println("Round netice: " + roundNetice);

    }}
