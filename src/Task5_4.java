import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Il daxil edin: ");
        int il = sc.nextInt();
//Əsas qayda (&& ilə iki şərt) və istisna hal (|| ilə) birləşir;
// nəticə boolean dəyişəndə saxlanır və ternary operator (? :) ilə bir sətirdə çap olunur.

        boolean uygunIl = (il % 4 == 0 && il % 100 != 0) || (il % 400 == 0);

            System.out.println(uygunIl ? "Uyğun il" : "Uyğun deyil");

        sc.close();
    }
}