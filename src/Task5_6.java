import java.util.Scanner;
public class Task5_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        double eded1 = sc.nextDouble();

        System.out.print("Əməliyyat işarəsi (+ - * /): ");
        String isare = sc.next();
//switch int əvəzinə String üzərində işləyir (əməliyyat işarəsi mətn kimi müqayisə olunur);
// bölmə case-i daxilində əlavə if ilə sıfıra bölmə xüsusi yoxlanır.
        System.out.println("Ikinci eded daxil edin: ");
        double eded2 = sc.nextDouble();

        switch (isare) {

            case "+":
                System.out.println("Nəticə: " + (eded1 + eded2));
                break;
            case "-":
                System.out.println("Nəticə: " + (eded1 - eded2));
                break;
            case "*":
                System.out.println("Nəticə: " + (eded1 * eded2));
                break;
            case "/":
                if (eded2 == 0) {
                    System.out.println("0-a bölmək olmaz!");
                } else {
                    System.out.println("Nəticə: " + (eded1 / eded2));
                }
                break;
            default:
                System.out.println("Naməlum əməliyyat işarəsi!");

    }
        sc.close();
    }}