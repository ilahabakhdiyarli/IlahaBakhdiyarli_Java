import java.util.Scanner;

public class Task5_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1-7 gun daxil edin: ");
        int gun = sc.nextInt();
        //Hər gün ayrı case-dir və break var; yalnız 6 və 7-də əlavə sətir lazım olduğu üçün fall-through nəzərə alınır.
        switch (gun) {
            case 1:
                System.out.println("Bazar ertesi");
                break;
            case 2:
                System.out.println("Cersenbe axsami");
                break;
            case 3:
                System.out.println("Cersenbe");
                break;
            case 4:
                System.out.println("Cume axsami");
                break;
            case 5:
                System.out.println("Cume");
                break;
            case 6:
                System.out.println("Senbe");
                System.out.println("Həftə sonu!");
                break;
            case 7:
                System.out.println("Bazar");
                System.out.println("Həftə sonu!");
                break;
            default:
                System.out.println("Yanlış gün nömrəsi");
        }
        sc.close();
    }
}