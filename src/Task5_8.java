import java.util.Scanner;
public class Task5_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a= ");
        int a = sc.nextInt();

        System.out.println("b= ");
        int b = sc.nextInt();

        System.out.println("c= ");
        int c = sc.nextInt();
//Xarici if üçbucağın mümkünlüyünü (&& ilə üç şərt) yoxlayır,
// daxili if-else if-else isə yalnız mümkün olduqda növü müəyyən edir — iç-içə şərt strukturu.
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Bərabərtərəfli");
            } else if (a == b || b == c || a == c) {
                System.out.println("Bərabəryanlı");
            } else {
                System.out.println("Müxtəliftərəfli");
            }
        } else {
            System.out.println("Belə üçbucaq mövcud deyil");
        }
        sc.close();
    }}