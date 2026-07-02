import java.util.Scanner;
public class Task4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tam eded (int) daxil edin: ");
        int tam = sc.nextInt();
        double tamDouble = tam; // widening
        System.out.println("Tam eded double: " + tamDouble);


        System.out.print("Onluq eded (double) daxil edin: ");
        double onluqEded = sc.nextDouble();
        int onluqInt = (int) onluqEded;// (int) kəsr hissəsini atır (yuvarlamır): 9.87 yox 9 verir

        System.out.println("Onluq eded int: " + onluqInt);

    }}
