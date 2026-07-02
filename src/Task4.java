import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a ədədini daxil edin: ");
        int a = sc.nextInt();

        System.out.print("b ədədini daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Başlanğıc:  a = " + a + ", b = " + b);

        a= a+b;
        System.out.println("1:  a = " + a + ", b = " + b);

        b=a-b;
        System.out.println("2:  a = " + a + ", b = " +b);

        a=a-b;
        System.out.println("3:  a = " + a + ", b = " +b);

        System.out.println("Nəticə:     a = " + a + ", b = " + b);
    }
}
