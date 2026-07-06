import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();
        System.out.println("c: ");
        int c = sc.nextInt();
//Hər ədəd digər ikisi ilə eyni anda müqayisə olunur (&& ilə);
// şərtlərin sırası nəticəyə təsir etmir, çünki hər if tam müqayisə aparır.
        int boyuk;
        if (a >= b && a >= c) {
            boyuk = a;
        } else if (b >= a && b >= c) {
            boyuk = b;
        } else {
            boyuk = c;
        }

        int kicik;
        if (a <= b && a <= c) {
            kicik = a;
        } else if (b <= a && b <= c) {
            kicik = b;
        } else {
            kicik = c;
        }
        System.out.println("En boyuk: " + boyuk);
        System.out.println("En kicik: " + kicik);
        sc.close();
    }
}


