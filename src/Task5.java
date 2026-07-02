import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tam ədəd (int) daxil edin: ");
        int a = sc.nextInt();
        double aDouble = a; // widening

        System.out.println("double a: " + aDouble);

        System.out.print("Onluq ədəd (double) daxil edin: ");
        double b = sc.nextDouble();
        int bInt = (int) b;// (int) kəsr hissəsini atır (yuvarlamır): 9.87 -> 9

        System.out.println("int b: " + bInt);

    }}
