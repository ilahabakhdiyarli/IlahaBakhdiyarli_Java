public class Task8_11 {
    public static void main(String[] args) {
        int[] orijinal = {5, 10, 15, 20};
        int[] kopya = new int[orijinal.length];

        for (int i = 0; i < orijinal.length; i++) {
            kopya[i] = orijinal[i];
        }
        kopya[0] = 99;
        for (int eded : orijinal) {
            System.out.print(eded + " ");
        }
        System.out.println();

        for (int eded : kopya) {
            System.out.print(eded + " ");
        }
    }
}
