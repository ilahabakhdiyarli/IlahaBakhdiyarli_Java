import java.util.Scanner;

public class Task5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Balans yoxla");
        System.out.println("2 - Pul yatır");
        System.out.println("3 - Pul çıxar");
        System.out.println("4 - Çıxış");
        System.out.print("Seçiminizi daxil edin: ");

//Sadə switch-case strukturu istifadəçi seçimini sabit mesajlarla uyğunlaşdırır, aralıqdan kənar seçim default-da tutulur.
        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Balansınız: 1250 AZN");
                break;
            case 2:
                System.out.println("Pul uğurla yatırıldı");
                break;
            case 3:
                System.out.println("Pul uğurla çıxarıldı");
                break;
            case 4:
                System.out.println("Sistemdən çıxılır...");
                break;
            default:
                System.out.println("Yanlış seçim");
        }
        sc.close();

    }
}