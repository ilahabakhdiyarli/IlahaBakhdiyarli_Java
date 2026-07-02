import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a ədədini daxil edin: ");
        int a = sc.nextInt();

        System.out.print("b ədədini daxil edin: ");
        int b = sc.nextInt();

        System.out.println("Toplama: a + b = " + (a + b));
        System.out.println("Çıxma:   a - b = " + (a - b));
        System.out.println("Vurma:   a * b = " + (a * b));
        System.out.println("Bölmə:   a / b = " + (a / b)); // bölmə gözlənilən kimi çıxmır,çünki int/int=int.kəsr hissə atılır.dəqiq bölünmə üçün ən azından biri double olmalıdır. Note:b=0 olsa xeta verecek.
        System.out.println("Qalıq:   a % b = " + (a % b));

    }}
