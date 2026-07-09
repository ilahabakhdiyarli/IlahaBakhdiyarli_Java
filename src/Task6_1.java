import java.util.Scanner;
public class Task6_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Bal daxil edin(1-100): ");
        int score =sc.nextInt();

        if (score>=50) {
            System.out.print("Bal:"+score+" → ");
if (score>=90) {
    System.out.print("Qiymet: Ela");
} else if (score>=70) {
    System.out.print("Qiymet: Yaxsi");
} else {
    System.out.print("Qiymet: Kafi");
}
        } else {
            System.out.print("Bal:"+score+" → Qiymet: Qeyri-kafi");
        }
        sc.close();
    }
}




//Qiymətləndirmə hesabatı
//1-dən 100-ə qədər bal alan tələbənin balını daxil et. Balı hərfi qiymətə çevir (
// 90+ Əla,
// 70-89 Yaxşı,
// 50-69 Kafi,
// aşağı Qeyri-kafi) və nəticəni "Bal: X → Qiymət: Y" formatında çap et.