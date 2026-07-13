public class Task7_5 {
    public static void main(String[] args) {
        System.out.println("---Kriptovalyutanın artımı---");

        double price = 1000;
        double hedef = price * 2;
        int increase = 8;
        int il = 0;

        while (price < hedef) {
            price = price + price * increase / 100;
            il++;
            System.out.printf("İl %d: %.2f AZN%n", il, price);
        }

        System.out.println("Ümumi " + il + " il çəkdi.");
    }
}
