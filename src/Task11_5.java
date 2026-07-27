import java.util.ArrayList;

public class Task11_5 {
    public static void main(String[] args) {


        ArrayList<String> musteri = new ArrayList<>();
        musteri.add("Ilaha");
        musteri.add("Mandarin");
        musteri.add("Karbon");
        musteri.add("Leyla");

        musteri.add(0, "VIP Elvin");

        boolean varmi = musteri.contains("Leyla");
        System.out.println("Leyla növbədədir? " + varmi);

        int indeks = musteri.indexOf("Leyla");
        musteri.set(indeks, "Nigar");

        for (int i = 0; i < musteri.size(); i++) {
            System.out.println(i + ": " + musteri.get(i));
        }
    }
}