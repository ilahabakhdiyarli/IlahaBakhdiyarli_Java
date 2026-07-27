import java.util.HashMap;
import java.util.Scanner;

public class Task11_7 {
    public static void main(String[] args) {
        HashMap<String, String> musteriler = new HashMap<>();
        musteriler.put("M001", "Ilaha Bakhdiyarli");
        musteriler.put("M002", "Kamran Əliyev");
        musteriler.put("M003", "Leyla Hüseynova");
        musteriler.put("M004", "Rəşad Quliyev");

        Scanner input = new Scanner(System.in);
        System.out.print("Müştəri kodunu daxil edin: ");
        String kod = input.nextLine();

        if (musteriler.containsKey(kod)) {
            System.out.println("Müştəri adı: " + musteriler.get(kod));
        } else {
            System.out.println("Belə müştəri tapılmadı");
        }
    }
}