import java.util.Scanner;

public class Task6_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ilkin balansi qeyd edin: ");
        double balance = sc.nextDouble();


        while (true) {
            System.out.print("Mədaxil üçün müsbət, məxaric üçün mənfi rəqəm yazın (Çıxmaq üçün 0): ");
            double mebleg = sc.nextDouble();

            if (mebleg == 0) {
                break; // 0 yazildiqda hesablama bitir
            }
            balance = balance + mebleg; //her defe yazilan mebleg toplanmis meblegin ustune gelir
            System.out.println("Netice: " + balance);
            if (balance < 0) {
                System.out.println("Diqqet! Balans menfidir!");
            }
        }
        sc.close();
    }
}
