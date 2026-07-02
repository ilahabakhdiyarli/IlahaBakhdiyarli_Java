import java.util.Scanner;
public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tam eded (int) daxil edin: ");
        int tamEded = sc.nextInt();
        double tamEded1 = tamEded; // widening

        System.out.println("Tam eded: " + tamEded1);

        System.out.print("Onluq eded (double) daxil edin: ");
        double onluqEded = sc.nextDouble();
        int bInt = (int) onluqEded;// (int) kəsr hissəsini atır (yuvarlamır): 9.87 yox 9 verir

        System.out.println("int b: " + bInt);

    }}
