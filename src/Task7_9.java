import java.util.Scanner;

public class Task7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Vahid çevirici menyusu---");

        while (true) {
            System.out.println("Menyu: \n1) Metr → Fut, \n2) Kiloqram → Funt, \n3) Selsi → Fahrenheit, \n0) Çıxış");
            System.out.print("Seçiminiz: ");
            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Çıxış edildi");
                break;
            }

            System.out.print("Ədəd daxil edin: ");
            double eded = input.nextDouble();
            double netice;

            switch (choice) {
                case 1:
                    netice = eded * 3.281;          // metr → fut
                    System.out.println("Nəticə: " + netice);
                    break;
                case 2:
                    netice = eded * 2.205;          // kq → funt
                    System.out.println("Nəticə: " + netice);
                    break;
                case 3:
                    netice = eded * 9 / 5 + 32;     // selsi → fahrenheit
                    System.out.println("Nəticə: " + netice);
                    break;
                default:
                    System.out.println("Yanlış seçim");

            }

        }
input.close();
    }
}

