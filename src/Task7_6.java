import java.util.Scanner;

public class Task7_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("---Aviaşirkət kodu---");
        System.out.print("Uçuş kodunun ilk 2 hərfini daxil edin: ");
        String kod = input.next().toUpperCase();


        String sirket;
        switch (kod) {
            case "AZ":
                sirket = "Azerbaijan Airlines";
                break;
            case "TK":
                sirket = "Turkish Airlines";
                break;
            case "QR":
                sirket = "Qatar Airways";
                break;
            default:
                sirket = "Naməlum aviaşirkət";
        }
        System.out.println(sirket);
        input.close();
    }
}
