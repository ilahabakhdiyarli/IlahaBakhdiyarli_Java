import java.util.Scanner;
public class Task5_1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner (System.in);
        System.out.print("Bir tam ədəd daxil edin: ");
        int eded = sc.nextInt();

        //cut ve tek
        if (eded%2==0){  //Cüt/tək yoxlaması % operatoru ilə aparılır (qalıq 0-dırsa cütdür).
            System.out.println(eded + " ədədi cütdür.");
        } else { System.out.println(eded + " ədədi təkdir.");}

        //menfi,musbet,sifir yoxlanilmasi
        if (eded>0) {
            System.out.println(eded + " ədədi müsbətdir.");
        } else if (eded<0){
            System.out.println(eded + " ədədi mənfidir.");
        }
        else { System.out.println("Ədəd sıfırdır.");
        }
        sc.close();
    }
}