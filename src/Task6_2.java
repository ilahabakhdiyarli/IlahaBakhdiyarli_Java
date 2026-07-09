import java.util.Scanner;
public class Task6_2 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                double cem = 0; // Balları üst-üstə toplayacağımız dəyişən. Başlanğıcda 0-dır.
                int telebeSayi = 10;

                System.out.println("Zəhmət olmasa 10 tələbənin balını daxil edin:\n");

                // Dövr 1-dən başlayır və 10-a qədər (10 daxil) işləyir
                for (int i = 1; i <= telebeSayi; i++) {
                    System.out.print(i + ". tələbənin balı: ");
                    double bal = sc.nextDouble(); // İstifadəçidən balı alırıq

                    cem = cem + bal; // Aldığımız balı ümumi cəmin üstünə gəlirik
                }

                // Dövr bitdikdən sonra orta balı hesablayırıq
                double ortaBal = cem / telebeSayi;


                System.out.println("Bütün balların cəmi: " + cem);
                System.out.println("Tələbələrin orta balı: " + ortaBal);


                if (ortaBal>70){
                    System.out.println("Sinif uğurludur");
                } else {
                    System.out.println("Əlavə işə ehtiyac var");
                }
        sc.close();
            }
        }








//Sinifin orta balı
//10 tələbənin balını ardıcıl daxil et (məs. Scanner ilə bir-bir soruşaraq), cəmini və orta balını hesabla.
// Orta bal 70-dən yuxarıdırsa "Sinif uğurludur", aşağıdırsa "Əlavə işə ehtiyac var" çap et.



