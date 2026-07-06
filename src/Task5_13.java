import java.util.Scanner;

public class Task5_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cekinizi daxil edin: ");
        double ceki = sc.nextDouble();
        System.out.print("Boyunuzu daxil edin ( meselen:167 ): ");
        double boy = sc.nextDouble()/100;

        //double nəticə else if zəncirində sərhəd dəyərlərinə (18.5, 24.9, 29.9) görə bölünür;
        // sərhədin özünün hansı kateqoriyaya aid olduğu diqqətlə seçilir (<= ilə).
        double bmi = ceki / (boy * boy);
        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Ariq");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 29.9) {
            System.out.println("Artiq cekili");
        } else {
            System.out.println("Piylenme");
        }
    }
}