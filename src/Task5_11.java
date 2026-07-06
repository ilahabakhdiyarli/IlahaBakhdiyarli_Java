import java.util.Scanner;

public class Task5_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir hərf daxil edin: ");
        char herf = sc.next().charAt(0);

//char dəyəri switch-də bütün sait hallarına (kiçik/böyük) qarşı fall-through ilə yoxlanır,
// uyğun gəlməyən hər şey default-da samit sayılır.
        switch (herf) {
            case 'a', 'e', 'i', 'ı', 'o', 'u', 'ü', 'ö', 'ə':
            case 'A', 'E', 'İ', 'I', 'O', 'U', 'Ü', 'Ö', 'Ə':
                System.out.println("Sait");
                break;
            default:
                System.out.println("Samit");


        }
    }
}