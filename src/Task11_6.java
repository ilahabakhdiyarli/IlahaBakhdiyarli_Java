import java.util.ArrayList;
public class Task11_6 {
    public static void main(String[] args) {

        ArrayList<Integer> emeliyyatlar = new ArrayList<>();
        emeliyyatlar.add(12);
        emeliyyatlar.add(34);
        emeliyyatlar.add(85);
        emeliyyatlar.add(50);
        emeliyyatlar.add(22);

        int cem = 0;
        for (int mebleg : emeliyyatlar) {
            cem += mebleg;
        }
        System.out.println("Ümumi cəm: " + cem);

        emeliyyatlar.clear();

        System.out.println("Siyahı boşdur? " + emeliyyatlar.isEmpty());
    }
}
