import java.util.Scanner;
public class Task8_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int result = 0;

        do {
            System.out.println("Eded daxil edin: ");
            number = sc.nextInt();
            result=result + number;
        }while  (number != 0);

        System.out.println("Cəm: " + result);
    }
}
