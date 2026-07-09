import java.util.Scanner;

public class Task6_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maxQol = 0; // cunki hele hansi maxdir bilmirik

        for (int i = 1; i <= 5; i++) {    //5 futbolcu sayini bildiyimiz ucun for istifade edirik
            System.out.print(i + "-ci futbolçunun qolunu daxil et: ");
            int qol = sc.nextInt();

            //  Yeni qol yaddaşdakı rekorddan böyükdürsə, rekordu yenilə
            if (qol > maxQol) {
                maxQol = qol;
            }
        }

        System.out.println("Nəticə: Ən çox vurulan qol sayı " + maxQol + " oldu!");

        sc.close();
    }
}
