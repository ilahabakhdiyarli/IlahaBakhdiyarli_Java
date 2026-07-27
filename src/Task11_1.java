import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {

        int umumiXerc = 1240;
        Scanner input = new Scanner(System.in);
        System.out.print("Əməliyyat sayını daxil edin: ");


        try {
            int emeliyyatSayi = input.nextInt();
            int ortaEmeliyyatMeblegi = umumiXerc / emeliyyatSayi;

            System.out.println("Orta əməliyyat məbləği: " + ortaEmeliyyatMeblegi);
        } catch (ArithmeticException e) {
            System.out.println("Xəta: Əməliyyat sayı sıfır ola bilməz!");
        } catch (Exception e) {
            System.out.println("Xəta: Düzgün dəyər daxil edilmədi!");
        } finally {
            System.out.println("Hesabat tamamlandı");
        }
    }
}
