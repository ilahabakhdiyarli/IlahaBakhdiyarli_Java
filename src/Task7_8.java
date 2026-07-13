import  java.util.Scanner;
public class Task7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.println("---Muzey bileti---");
        System.out.println("Bir nəfərin yaşını daxil et: ");
        int yas = input.nextInt();

        int qiymet;
        if (yas <= 6)
            qiymet = 0;
        else if (yas <= 17)
            qiymet = 2;
        else if (yas <= 60)
            qiymet = 5;
        else
            qiymet = 3;

        System.out.println("Bir biletin qiyməti: " + qiymet + " AZN");

        System.out.print("Neçə bilet almaq istəyirsiniz: ");
        int say = input.nextInt();

        int umumi = qiymet * say;
        System.out.println("Ümumi məbləğ: " + umumi + " AZN");
input.close();
    }
}