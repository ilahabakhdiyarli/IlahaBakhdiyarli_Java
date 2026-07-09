import java.util.Scanner;
public class Task6_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ağlımda bir rəqəm tutmuşam, görək neçə cəhdə tapacaqsan?");

        int gizli=42;
        int cehd = 0;


        while (true) {
            System.out.print("Təxmininizi daxil edin: ");
            int texmin = sc.nextInt();
            cehd++;

            if (texmin == gizli) {
                System.out.println("Tapdın!");
                break;

            } else if (texmin > gizli) {
                System.out.println("Gizli reqem daha kiçikdir");

            } else {
                System.out.println("Gizli reqem daha böyükdür");
            }
        }

        System.out.println("Siz gizli rəqəmi cəmi " + cehd + " cəhddə tapdınız!");
        sc.close();

//Kodda gizli bir ədəd (məs. int gizli = 42) təyin et. İstifadəçi düzgün tapana qədər ədəd daxil etsin;
// hər cəhddən sonra "Böyükdür", "Kiçikdir" və ya "Tapdın!" göstər, sonda neçə cəhd apardığını çap et.
    }}