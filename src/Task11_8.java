import java.util.HashMap;
import java.util.Map;

public class Task11_8 {
    public static void main(String[] args) {
        HashMap<String, Integer> filiallar = new HashMap<>();
        filiallar.put("Nərimanov", 120);
        filiallar.put("Yasamal", 95);
        filiallar.put("Xətai", 140);
        filiallar.put("Nizami", 80);

        System.out.println("Cüt sayı: " + filiallar.size());

        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " → " + cut.getValue());
        }
        filiallar.remove("Yasamal");

        System.out.println("\nBir filial bağlandıqdan sonra cüt sayı: " + filiallar.size());

        for (Map.Entry<String, Integer> cut : filiallar.entrySet()) {
            System.out.println(cut.getKey() + " → " + cut.getValue());
        }
    }
}
