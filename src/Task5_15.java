import java.util.Scanner;

public class Task5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Parolunuzu qeyd edin: ");
        String parol = sc.nextLine();

        int uzunluq = parol.length();
//Boş parol ilkin, ayrıca şərt kimi yoxlanır (çünki ən xüsusi haldır),
// qalan uzunluq aralıqları isə else if zənciri ilə bölünür.
        if (uzunluq == 0) {
            System.out.println("Parol boş ola bilməz");
        } else if (uzunluq < 6) {
            System.out.println("Zeif");
        } else if (uzunluq <= 9) {
            System.out.println("Orta");
        } else {
            System.out.println("Guclu");
        }
        sc.close();
    }
}
