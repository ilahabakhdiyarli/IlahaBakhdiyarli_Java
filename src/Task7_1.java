import java.util.Scanner;

public class Task7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Hava statusu---");
        System.out.print("Havanin temperaturunu daxil et: ");

        int degree = sc.nextInt();

        String status;
        if (degree > 25)
            status = "Isti";
        else if (degree >= 15)
            status = "Mulayim";
        else if (degree >= 0)
            status = "Soyuq";
        else
            status = "Saxta";

        System.out.println("Temperatur: " + degree + "°C → Status: " + status);

        sc.close();
        }

    }

