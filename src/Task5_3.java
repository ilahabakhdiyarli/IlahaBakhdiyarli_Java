import java.util.Scanner;
public class Task5_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Imtahan balini daxil edin: ");
        int qiymet = sc.nextInt();

//else if pilləkəni yuxarıdan aşağıya (ən yüksək baldan başlayaraq) qurulmalıdır —
// əks halda aşağı bal aralığı yuxarı balları da "tutar".
        if (qiymet < 0 || qiymet > 100) {
            System.out.println("Yanlış bal!");
        } else if (qiymet >= 90) {
            System.out.println("Əla (5)");
        } else if (qiymet >= 80) {
            System.out.println("Çox yaxşı (4)");
        } else if (qiymet >= 70) {
            System.out.println("Yaxşı (3)");
        } else if (qiymet >= 60) {
            System.out.println("Kafi (2)");
        } else {
            System.out.println("Qeyri-kafi (1)");
        }
        sc.close();
        }}




